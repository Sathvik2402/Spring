package com.nt;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class SpringBootI18nApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootI18nApplication.class, args);
	}

	@Bean(name="localeResolver")
	public SessionLocaleResolver createResolver() {
		SessionLocaleResolver resolver=new SessionLocaleResolver();
		resolver.setDefaultLocale(new Locale("en","US"));
		return resolver;
	}
	
	@Bean(name="Lci")
	public LocaleChangeInterceptor createInterceptor(){
		LocaleChangeInterceptor lci=new LocaleChangeInterceptor();
		lci.setParamName("lang");
		return lci;
		
	}
}
