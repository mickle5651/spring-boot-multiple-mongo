package com.hisign.springboot;

import com.hisign.springboot.config.MultipleMongoProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@EnableConfigurationProperties(MultipleMongoProperties.class)
@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class MongodbApplication {




	public static void main(String[] args) {
		SpringApplication.run(MongodbApplication.class, args);
	}
}
