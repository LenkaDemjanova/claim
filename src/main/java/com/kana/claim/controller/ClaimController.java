package com.kana.claim.controller;

import com.kana.claim.dto.ClaimDto;
import com.kana.claim.service.ClaimService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClaimController {
    private final ClaimService claimService;

    @GetMapping("/all")
    public List<ClaimDto> getAllClaims() {
        return claimService.getAllClaims();
    }

    @PostMapping("/create")
    public ResponseEntity<ClaimDto> createClaim(@RequestBody ClaimDto claimDto) {
        var createdClaim = claimService.createClaim(claimDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdClaim);
    }
}
