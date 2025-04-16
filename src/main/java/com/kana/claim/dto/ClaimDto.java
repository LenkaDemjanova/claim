package com.kana.claim.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ClaimDto {
    private Long Id;
    private String policyNumber;
    private String description;
    private LocalDateTime claimDate;
}
