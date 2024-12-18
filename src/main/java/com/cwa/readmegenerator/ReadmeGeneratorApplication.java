package com.cwa.readmegenerator;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReadmeGeneratorApplication {

    public static void main(String[] args) {
        var dotenv = Dotenv.load();

        dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));

        SpringApplication.run(ReadmeGeneratorApplication.class, args);
    }

}
