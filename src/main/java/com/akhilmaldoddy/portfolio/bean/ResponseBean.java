package com.akhilmaldoddy.portfolio.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ResponseBean<T> {
    private int status;
    private String message;
    private T data;
}
