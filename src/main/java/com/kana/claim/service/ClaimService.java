package com.kana.claim.service;

import com.kana.claim.dto.ClaimDto;
import com.kana.claim.entity.Claim;
import com.kana.claim.mapper.ClaimMapper;
import com.kana.claim.repository.ClaimRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClaimService {
    private final ClaimRepository claimRepository;
    private final ClaimMapper claimMapper;

    public List<ClaimDto> getAllClaims() {
        return claimRepository.findAll().stream()
                .map(claimMapper::mapToDto)
                .collect(Collectors.toList());
    }

    public ClaimDto createClaim(ClaimDto claimDto) {
        Claim claim = claimMapper.mapToEntity(claimDto);
        claim.setClaimDate(LocalDateTime.now());
        return claimMapper.mapToDto(claimRepository.save(claim));
    }
}
