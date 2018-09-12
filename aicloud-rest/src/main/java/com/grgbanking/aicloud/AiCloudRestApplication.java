package com.grgbanking.aicloud;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.grgbanking.aicloud.mapper")
public class AiCloudRestApplication {

    private final static Logger logger = LoggerFactory.getLogger(AiCloudRestApplication.class);

    public static void main(String[] args) {
        logger.info("start app");
		SpringApplication.run(AiCloudRestApplication.class, args);
	}
}
