package com.darshanbk812.payment_serveice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentServeiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentServeiceApplication.class, args);
	}

}
