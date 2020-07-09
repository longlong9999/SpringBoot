package com.example.demo;

import org.springframework.stereotype.Component;

/*Đánh dấu class bằng @cComponent
Class này sẽ được Spring Boot hiểu là một Bean(Hoặc depndency)
Và sẽ được Spring Boot quản lý*/


@Component
public class Bikini implements Outfit{
	public void wear() {
		System.out.println("Mac quan ao");
	}

}
