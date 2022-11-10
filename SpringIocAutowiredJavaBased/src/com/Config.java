package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean(name = "e")
	public Exam e() {
		Exam e = new Exam();
		e.setEid(123);
		e.setEname("Engg.");
		e.setEtype("Online");
		return e;
	}
	
	@Bean(name = "e1")
	public Exam e2() {
		Exam e = new Exam();
		e.setEid(13);
		e.setEname("BCA");
		e.setEtype("Online");
		return e;
	}
	
	@Bean
	public University u() {
	
		University univeristy =  new University();
		univeristy.setUid(123);
		univeristy.setUname("SPPU");
		//univeristy.setExam(e());
		return univeristy;
	}
	
}
