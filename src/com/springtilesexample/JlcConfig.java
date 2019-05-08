package com.springtilesexample;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan({ "com.springtilesexample" })
public class JlcConfig {

	@Bean
	public TilesViewResolver tilesViewResolver() {
		System.out.println("jlcConfig-View");
		TilesViewResolver viewResolver = new TilesViewResolver();
		return viewResolver;
	}

	@Bean
	public TilesConfigurer tilesConfigurer() {
		System.out.println("jlcConfig-Config");
		TilesConfigurer configurer = new TilesConfigurer();
		configurer.setDefinitions("WEB-INF/tiles.xml");
		return configurer;
	}
	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource=new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("/WEB-INF/messages");
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}
}
