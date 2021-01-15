package com.tropical.codegeneratorapp;

import com.tropical.codegeneratorapp.model.Code;
import com.tropical.codegeneratorapp.repository.CodeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(CodeRepository codeRepository) {
        return args -> {
            log.info("Preloading " + codeRepository.save(new Code("KSL23A", false, true)));
            log.info("Preloading " + codeRepository.save(new Code("YQ2B0Z", true, false)));
            log.info("Preloading " + codeRepository.save(new Code("PQ120V", false, false)));
        };
    }
}
