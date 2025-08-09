package com.gxr.codegenerate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gxr.codegenerate.mapper")
public class CodeGenerateBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeGenerateBackendApplication.class, args);
    }

}
