package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student Michael =  new Student(
                    1L, "Michael",  LocalDate.of(1996,5,23) , "michaelyeohq@gmail.com"
            );

            Student Test =  new Student(
                    2L, "Test",  LocalDate.of(2005,5,23) , "michaelyeohq@gmail.com"
            );

            repository.saveAll(List.of(Michael, Test));
        };
    }
}
