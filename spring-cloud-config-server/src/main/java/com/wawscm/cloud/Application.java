/*
 * Copyright © 2015-2016 WAWSCM Inc. All rights reserved.
 */
package com.wawscm.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * server config
 *
 * @author Wang Chengwei
 * @since 1.0.0
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class Application {

    public static void main(String... args) {
        SpringApplication.run(Application.class, args).getEnvironment();
    }
}
