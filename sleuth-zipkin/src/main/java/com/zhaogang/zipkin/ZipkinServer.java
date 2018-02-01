package com.zhaogang.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableDiscoveryClient //注册到eureka
@EnableZipkinServer //启动ZipkinServer段
//@EnableZipkinStreamServer//使用Stream方式启动ZipkinServer
public class ZipkinServer {

	 public static void main(String[] args) {
	        SpringApplication.run(ZipkinServer.class, args);
	    }
}
