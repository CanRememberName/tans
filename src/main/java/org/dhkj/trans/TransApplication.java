package org.dhkj.trans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TransApplication {
    private static final Logger logger = LoggerFactory.getLogger(TransApplication.class);
    public static void main(String[] args) {
        logger.error("我是第一次启动吗");
        SpringApplication.run(TransApplication.class, args);
    }

}
