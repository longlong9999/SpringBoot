package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//annnotation
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		 // ApplicationContext chính là container, chứa toàn bộ các Bean
	ApplicationContext context=	(ApplicationContext) SpringApplication.run(App.class, args);
	
	  // Khi chạy xong, lúc này context sẽ chứa các Bean có đánh
    // dấu @Component.
	// Lấy Bean ra bằng cách
	
	}

}