package com.tangl.song.infra.basic.utils;

import com.alibaba.druid.filter.config.ConfigTools;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

/**
 * 数据库加密工具类
 */
public class DruidEncryptUtil {

    private static final String publicKey;

    private static final String privateKey;

    static {
        try {
            String[] keyPair = ConfigTools.genKeyPair(512);
            privateKey = keyPair[0];
            publicKey = keyPair[1];
            System.out.println("privateKey = " + privateKey);
            System.out.println("publicKey = " + publicKey);
        } catch (NoSuchAlgorithmException | NoSuchProviderException e) {
            throw new RuntimeException(e);
        }
    }

    public static String encrypt(String plainText) throws Exception {
        return ConfigTools.encrypt(privateKey, plainText);
    }

    public static String decrypt(String encryptText) throws Exception {
        return ConfigTools.decrypt(publicKey, encryptText);
    }

    public static void main(String[] args) throws Exception {
        String encrypt = encrypt("Qaqa123+");
        System.out.println("encrypt = " + encrypt);
    }
}
