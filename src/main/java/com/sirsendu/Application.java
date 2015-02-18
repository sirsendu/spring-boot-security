package com.sirsendu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Main application
 *
 * @author Sirsendu Konar
 */
@ComponentScan
@EnableAutoConfiguration
public class Application extends SpringBootServletInitializer {
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class.getName());

    @Override
    protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(final String[] args) {
        LOGGER.info("Starting Main Application...");
        SpringApplication.run(Application.class, args);
        LOGGER.info("Access URLs: http://127.0.0.1:9999\n");
    }

}
