package com.akhilmaldoddy.portfolio.controller;

import com.akhilmaldoddy.portfolio.bean.ResponseBean;
import com.akhilmaldoddy.portfolio.dto.CompanyDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequestMapping("/compiler")
public interface ICompilerController {

    @PostMapping("/run-code")
    ResponseEntity<?> runCode(@RequestBody Map<String, String> request);

}
