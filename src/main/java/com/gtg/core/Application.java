package com.gtg.core;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
/*@PropertySources(value={
@PropertySource(value="application.properties")
})*/
@EnableWebMvc
@EnableAutoConfiguration
@EntityScan(basePackages = "com.gtg.core.entity")
@EnableJpaRepositories(basePackages = "com.gtg.core.repository")
@ComponentScan(basePackages = {
		"com.gtg.core", 
		"com.gtg.core.config", 
		"com.gtg.core.utils" ,
		"com.gtg.core.redis.repository"})
public class Application implements CommandLineRunner {

	public void run(String... arg0) throws Exception {

	}

	public static void main(String... args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
	}

}
