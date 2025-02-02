package com.member.domain.member.controller;

import com.member.domain.member.dto.MemberFormDTO;
import com.member.domain.member.service.JoinService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class JoinController {

    private final JoinService joinService;

    @PostMapping
    public ResponseEntity<Long> joinMember(@Validated @RequestBody MemberFormDTO memberFormDTO) {
        Long memberId = joinService.join(memberFormDTO);
        return new ResponseEntity<>(memberId, HttpStatus.CREATED);
    }
}
