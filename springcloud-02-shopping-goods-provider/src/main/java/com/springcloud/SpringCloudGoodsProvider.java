/**
 * 
 */
package com.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author tanjiagui
 *
 */
@MapperScan("com.springcloud.dao")  //����Mybatis�ӿ����ڵ�λ��
@SpringBootApplication
public class SpringCloudGoodsProvider {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudGoodsProvider.class, args);
	}

}
