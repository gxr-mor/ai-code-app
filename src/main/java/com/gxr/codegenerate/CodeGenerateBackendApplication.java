package com.gxr.codegenerate;

import dev.langchain4j.community.store.embedding.redis.spring.RedisEmbeddingStoreAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {RedisEmbeddingStoreAutoConfiguration.class})
@MapperScan("com.gxr.codegenerate.mapper")
public class CodeGenerateBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeGenerateBackendApplication.class, args);
    }

}
