package com.akhilmaldoddy.portfolio.controller;

import com.akhilmaldoddy.portfolio.bean.ExecutionResult;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class CompilerControllerImpl implements ICompilerController{

    @Override
    public ResponseEntity<?> runCode(Map<String, String> request) {
        String code = request.get("code");

        try {
            // 1. Create a temporary .java file
            File sourceFile = new File("Main.java");
            Files.write(sourceFile.toPath(), code.getBytes());

            // 2. Compile using the System Java Compiler
            Process compileProcess = Runtime.getRuntime().exec("javac Main.java");
            compileProcess.waitFor();

            // 3. If compilation successful, Run it
            Process runProcess = Runtime.getRuntime().exec("java Main");

            BufferedReader reader = new BufferedReader(new InputStreamReader(runProcess.getInputStream()));
            String output = reader.lines().collect(Collectors.joining("\n"));

            return ResponseEntity.ok(new ExecutionResult(output, 0));
        } catch (Exception e) {
            return ResponseEntity.ok(new ExecutionResult(e.getMessage(), 1));
        }
    }

}
