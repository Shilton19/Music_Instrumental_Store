package com.example.Music.Instrumental.Store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.Music.Instrumental.Store.Model")
public class MusicInstrumentalStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicInstrumentalStoreApplication.class, args);
	}

}
