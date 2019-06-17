/**
 * 
 */
package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author tanjiagui
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class SpringCloudZuul {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringCloudZuul.class, args);
	}

}
