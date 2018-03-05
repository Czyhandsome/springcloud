package org.czy.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ${DESCRIPTION}
 *
 * @author 曹子钰, 2018/3/5
 */
@SpringBootApplication
@EnableDiscoveryClient
public class HelloServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloServiceApplication.class, args);
    }
}
