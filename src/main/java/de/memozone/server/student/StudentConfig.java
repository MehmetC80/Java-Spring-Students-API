package de.memozone.server.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {

        return args -> {

            Student memo = new Student(

                    "memo",
                    "memo@web.de",
                    LocalDate.of(1980, Month.JULY, 11)
            );

            Student mehmet = new Student(

                    "mehmet",
                    "mehmet@web.de",
                    LocalDate.of(1980, Month.JULY, 11)
            );

            Student peter = new Student(

                    "peter",
                    "peter@web.de",
                    LocalDate.of(1990, Month.AUGUST, 15)
            );

            Student hans = new Student(

                    "hans",
                    "hans@web.de",
                    LocalDate.of(1987, Month.JUNE, 25)
            );

            Student heike = new Student(

                    "heike",
                    "heike@web.de",
                    LocalDate.of(2000, Month.FEBRUARY, 19)
            );

              repository.saveAll(List.of(memo,mehmet,peter,hans,heike));
        };


    }


}
