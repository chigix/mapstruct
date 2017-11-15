package com.chigix.mapstruct;

/**
 * User
 */
public class User {

    private String uuid;

    private String name;

    public User(String uuid, String name) {
        this.uuid = uuid;
        this.name = name;
    }

    /**
     * @return the uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
}