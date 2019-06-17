/**
 * 
 */
package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author tanjiagui
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaServer.class, args);

	}

}
