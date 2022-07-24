package com.java.code.eg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.dependencies.eg.FortuneService;
import com.dependencies.eg.IFortuneService;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {

	// define bean for dependency
	
	@Bean
	public IFortuneService fortuneService() {
		return new FortuneService();
	}
	// define bean for coach and inject dependency
	
	@Bean
	public Coach coachImpl() {
		return new BasketBallCoach(fortuneService());
	}
}
