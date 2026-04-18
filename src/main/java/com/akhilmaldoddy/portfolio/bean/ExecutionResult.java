package com.akhilmaldoddy.portfolio.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ExecutionResult {
    private String output;
    private int exitCode;
}
