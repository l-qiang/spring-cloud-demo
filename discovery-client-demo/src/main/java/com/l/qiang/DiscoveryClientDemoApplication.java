package com.l.qiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liuqiang.ryan@gmail.com
 */
@SpringBootApplication
@EnableEurekaClient
public class DiscoveryClientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryClientDemoApplication.class, args);
	}

}
