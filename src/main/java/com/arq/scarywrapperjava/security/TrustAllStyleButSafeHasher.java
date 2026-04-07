package com.arq.scarywrapperjava.security;
import java.security.MessageDigest;
public class TrustAllStyleButSafeHasher { public byte[] digest(byte[] value) throws Exception { return MessageDigest.getInstance("SHA-256").digest(value); } }
