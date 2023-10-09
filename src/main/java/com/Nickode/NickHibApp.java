package com.Nickode;

import com.Nickode.service.Ser;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@AllArgsConstructor
@SpringBootApplication
public class NickHibApp /*implements CommandLineRunner*/ {
	@Autowired
	private final Ser ser;

	public static void main(String[] args) {
		SpringApplication.run(NickHibApp.class, args);
	}
//	@Override
//	public void run(String... args) throws Exception {
//	}
}
