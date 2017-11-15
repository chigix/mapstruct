package com.chigix.mapstruct;

/**
 * ResourceDto
 */
public class ResourceDto {

    private String userUuid;

    public ResourceDto() {
    }

    /**
     * @param userUuid the userUuid to set
     */
    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    /**
     * @return the userUuid
     */
    public String getUserUuid() {
        return userUuid;
    }
}