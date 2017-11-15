package com.chigix.mapstruct;

/**
 *
 * @author Richard Lea
 */

public class Resource {

    private String bucketUuid;

    /**
     * @return the bucketUuid
     */
    public Bucket getBucket() throws NoSuchBucket {
        Bucket b = Database.BUCKETS.get(bucketUuid);
        if (b == null) {
            throw new NoSuchBucket("The bucket with uuid as [" + bucketUuid + "]  is not existing.");
        }
        return b;
    }
}