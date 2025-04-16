package com.kana.claim.mapper;

import com.kana.claim.dto.ClaimDto;
import com.kana.claim.entity.Claim;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClaimMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "policyNumber", source = "policyNumber")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "claimDate", source = "claimDate")
    ClaimDto mapToDto(Claim claim);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "policyNumber", source = "policyNumber")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "claimDate", source = "claimDate")
    Claim mapToEntity(ClaimDto claimDto);
}
