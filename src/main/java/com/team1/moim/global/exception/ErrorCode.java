package com.team1.moim.global.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
@Getter
public enum ErrorCode {

    JWT_EXPIRED(HttpStatus.UNAUTHORIZED, "로그인이 만료 되었습니다."),
    ACCESS_DENIED(HttpStatus.FORBIDDEN, "접근 권한이 없습니다."),
    LOGIN_FAILED(HttpStatus.BAD_REQUEST, "로그인에 실패했습니다. 이메일 또는 비밀번호를 확인해주세요."),

    // Group
    GROUP_NOT_FOUND(HttpStatus.NOT_FOUND, "존재하지 않는 모임입니다."),
    GROUP_INFO_NOT_FOUND(HttpStatus.NOT_FOUND, "존재하지 않는 모임 게스트입니다."),
    PARTICIPANT_REQUIRED(HttpStatus.BAD_REQUEST, "모임 참여자를 1명 이상 등록해야 합니다."),
    PARTICIPANT_INFO_NOT_MATCH(HttpStatus.BAD_REQUEST, "모임 참여자 정보가 일치하지 않습니다."),
    ALREADY_VOTED(HttpStatus.BAD_REQUEST, "이미 투표하였습니다."),
    GROUP_AND_GROUP_INFO_NOT_MATCH(HttpStatus.BAD_REQUEST, "모임과 모임 정보가 서로 관련이 없습니다."),
    HOST_INCLUDED(HttpStatus.BAD_REQUEST, "호스트는 모임 참여자에 추가할 수 없습니다."),

    // Member
    EMAIL_DUPLICATION(HttpStatus.BAD_REQUEST, "이미 존재하는 이메일입니다."),
    EMAIL_NOT_FOUND(HttpStatus.NOT_FOUND, "존재하지 않는 이메일입니다."),
    MEMBER_NOT_FOUND(HttpStatus.NOT_FOUND, "존재하지 않는 회원입니다."),
    PASSWORD_NOT_MATCH(HttpStatus.BAD_REQUEST, "비밀번호가 일치하지 않습니다."),
    NICKNAME_DUPLICATION(HttpStatus.BAD_REQUEST, "이미 존재하는 닉네임입니다.");

    private final HttpStatus status;
    private final String message;
}
