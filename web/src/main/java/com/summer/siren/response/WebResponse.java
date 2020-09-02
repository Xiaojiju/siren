package com.summer.siren.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class WebResponse<T> {

    private T body;
    private String msg;
    private int code;

    public WebResponse(T body) {
        this(body, HttpStatus.OK.getReasonPhrase());
    }

    public WebResponse(T body, String msg) {
        this(body, msg, HttpStatus.OK.value());
    }

    public WebResponse(T body, String msg, int code) {
        this.body = body;
        this.msg = msg;
        this.code = code;
    }
}
