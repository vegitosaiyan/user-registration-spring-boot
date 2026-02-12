package com.example.userregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class KubernetesApplication {

	public static void main(String[] args) {

        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        SpringApplication.run(KubernetesApplication.class, args);
	}

}
