package com.example.springrider.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ExceptionCode {

    // 인증/인가
    AUTH_EXCEPTION("인증인가 예외 메세지"),

    // 회원
    USER_EXCEPTION("회원 예외 메세지"),

    // 가게
    STORE_EXCEPTION("가게 예외 메세지"),

    // 메뉴
    MENU_EXCEPTION("메뉴 예외 메세지"),

    // 주문
    ORDER_EXCEPTION("주문 예외 메세지"),

    // 리뷰
    REVIEW_EXCEPTION("리뷰 예외 메세지");

    private final String message;

}
