package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository ) {
        return args -> {
           Student Casey = new Student(
                    "Casey",
                    "casey@gmail.com",
                    LocalDate.of(1992,
                            Month.JUNE,
                            10)
            );

            Student Joseph = new Student(
                    "Joseph",
                    "joseph@gmail.com",
                    LocalDate.of(1993,
                            Month.FEBRUARY,
                            14)
            );

            repository.saveAll(
                    List.of(Casey, Joseph)
                    );

        };
    }
}
