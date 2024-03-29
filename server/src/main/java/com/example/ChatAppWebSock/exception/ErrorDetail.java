package com.example.ChatAppWebSock.exception;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
public class ErrorDetail {
    private String error;
    private String message;
    private LocalDateTime timeStamp;
}
