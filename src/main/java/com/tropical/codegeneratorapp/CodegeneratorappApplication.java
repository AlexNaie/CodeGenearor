package com.tropical.codegeneratorapp;

import com.tropical.codegeneratorapp.model.Code;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import static com.tropical.codegeneratorapp.model.Code.generateOneCode;

@SpringBootApplication
public class CodegeneratorappApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodegeneratorappApplication.class, args);
//        generateOneCode(5);
    }



}
