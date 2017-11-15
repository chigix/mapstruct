package com.chigix.mapstruct;

/**
 * Bucket
 */
public class Bucket {

    private String uuid;

    private String name;

    private String userUuid;

    public Bucket(String uuid, String name, String userId) {
        this.name = name;
        this.uuid = uuid;
        this.userUuid = userId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @return the user
     */
    public User getUser() throws NoSuchUser {
        User u = Database.USERS.get(userUuid);
        if (u == null) {
            throw new NoSuchUser("No Such user with uuid of [" + userUuid + "]");
        }
        return u;
    }
}