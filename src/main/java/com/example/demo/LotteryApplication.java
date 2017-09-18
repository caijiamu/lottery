package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import java.util.Random;

@SpringBootApplication()
public class LotteryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LotteryApplication.class, args);

//		test();
	}

	public static void test() {
		System.out.print("testLottery");

		Lottery3d lottery3d = new  Lottery3d();
		int count = 0 ;
		for (int i = 0; i <28 ; i++) {
			count += lottery3d.autoCount3d(i);
		}
		System.out.print(String.format("和值共%d种",count));
	}
}
