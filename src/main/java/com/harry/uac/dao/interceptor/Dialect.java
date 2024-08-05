package com.harry.uac.dao.interceptor;

public interface Dialect {

    public static enum Type {
	MYSQL, ORACLE
    }

    public boolean supportsLimit();

    public String getLimitString(String sql, boolean hasOffset);

    public String getLimitString(String sql, int offset, int limit);

}
