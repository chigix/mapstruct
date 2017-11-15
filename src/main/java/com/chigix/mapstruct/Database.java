package com.chigix.mapstruct;

import java.util.HashMap;
import java.util.Map;

/**
 * Database
 */
public class Database {

    static {
        initData();
    }

    private static void initData() {
        BUCKETS.put("1234", new Bucket("1234", "TEST_BUCKET", "2345"));
        USERS.put("2345", new User("2345", "TEST_USER"));
    }

    public static final Map<String, Bucket> BUCKETS = new HashMap<>();
    public static final Map<String, User> USERS = new HashMap<>();
}