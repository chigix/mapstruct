package com.chigix.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * ResourceMapper
 */
@Mapper
public interface ResourceMapper {

    @Mappings({
            @Mapping(source="bucket.user.uuid", target="userUuid")
        })
    ResourceDto map(Resource bean) throws NoSuchBucket, NoSuchUser;
}