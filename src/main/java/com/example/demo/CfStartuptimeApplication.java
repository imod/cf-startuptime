package com.example.demo;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CfStartuptimeApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(CfStartuptimeApplication.class);

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		SpringApplication.run(CfStartuptimeApplication.class, args);

		long end = System.currentTimeMillis();
		long millis = end - start;
		String time = String.format("%02d min, %02d sec",
				TimeUnit.MILLISECONDS.toMinutes(millis),
				TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
		LOGGER.info("TIME USED: {} milliseconds - {}", millis, time);
	}

}
