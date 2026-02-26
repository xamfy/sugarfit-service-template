package com.sugarfit.service.util;

import java.util.UUID;

public final class RequestIdGenerator {

    private RequestIdGenerator() {
        // Prevent instantiation
    }

    public static String generate() {
        return UUID.randomUUID().toString();
    }
}
