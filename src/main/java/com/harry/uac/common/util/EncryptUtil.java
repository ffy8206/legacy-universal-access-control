package com.harry.uac.common.util;

import com.harry.uac.persistence.AuthUser;
import org.springside.modules.security.utils.Digests;
import org.springside.modules.utils.Encodes;

public class EncryptUtil {
    public static final String HASH_ALGORITHM = "SHA-1";
    public static final int HASH_INTERATIONS = 1024;
    private static final int SALT_SIZE = 8;
    
    /**
     * 设定安全的密码，生成随机的salt并经过1024次 sha-1 hash
     */
    public static void encryptPassword(AuthUser user, String pwd) {
	byte[] salt = Digests.generateSalt(SALT_SIZE);
	user.setUserSalt(Encodes.encodeHex(salt));
	byte[] hashPassword = Digests.sha1(pwd.getBytes(), salt, HASH_INTERATIONS);
	user.setUserPassword(Encodes.encodeHex(hashPassword));
    }
    
    public static String decryptPassword(String pwd, String psalt) {
	byte[] salt = Encodes.decodeHex(psalt);
	byte[] hashPassword = Digests.sha1(pwd.getBytes(), salt, HASH_INTERATIONS);
	return Encodes.encodeHex(hashPassword);
    }
    
    public static void main(String[] args) {
	String pwd = "123456";
	byte[] salt = Digests.generateSalt(SALT_SIZE);
	System.out.println(Encodes.encodeHex(salt));
	byte[] hashPassword = Digests.sha1(pwd.getBytes(), salt, HASH_INTERATIONS);
	System.out.println(Encodes.encodeHex(hashPassword));
    }
    
}
