package com.banvien.fc.smartshopper.web.logic.exception;

public class CustomException extends RuntimeException {


    private final String message;
    private final ErrorCode code;


    public CustomException(String message) {
        this.message = message;
        this.code = ErrorCode.NOT_FOUND;

    }

    public CustomException (String message, ErrorCode code) {
        this.message = message;
        this.code = code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    public ErrorCode getCode() {
        return this.code;
    }
}
