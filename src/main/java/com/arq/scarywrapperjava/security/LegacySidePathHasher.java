package com.arq.scarywrapperjava.security;
import java.security.MessageDigest;
public class LegacySidePathHasher { public byte[] digest(byte[] value) throws Exception { return MessageDigest.getInstance("SHA-1").digest(value); } }
