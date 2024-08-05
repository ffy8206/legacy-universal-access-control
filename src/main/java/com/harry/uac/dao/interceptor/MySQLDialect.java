package com.harry.uac.dao.interceptor;

public class MySQLDialect implements Dialect {

    protected static final String SQL_END_DELIMITER = ";";

    public String getLimitString(String sql, boolean hasOffset) {
	sql = trim(sql);
	StringBuffer sb = new StringBuffer(sql.length() + 20);
	sb.append(sql);
	if (!sql.toLowerCase().contains("limit".toLowerCase())) {
	    sb.append(hasOffset ? " limit ?,?": " limit ?").append(SQL_END_DELIMITER).toString();
	}
	return sb.toString();
    }

    public String getLimitString(String sql, int offset, int limit) {
	sql = trim(sql);
	StringBuffer sb = new StringBuffer(sql.length() + 20);
	sb.append(sql);
	if (!sql.toLowerCase().contains("limit".toLowerCase())) {
	    if (offset > 0) {
		sb.append(" limit ").append(offset).append(',').append(limit).append(SQL_END_DELIMITER);
	    } else {
		sb.append(" limit ").append(limit).append(SQL_END_DELIMITER);
	    }
	}
	return sb.toString();
    }

    public boolean supportsLimit() {
	return true;
    }

    private String trim(String sql) {
	sql = sql.trim();
	if (sql.endsWith(SQL_END_DELIMITER)) {
	    sql = sql.substring(0, sql.length() - 1 - SQL_END_DELIMITER.length());
	}
	return sql;
    }

}
