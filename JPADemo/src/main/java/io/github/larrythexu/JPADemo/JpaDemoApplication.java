package io.github.larrythexu.JPADemo;

import io.github.larrythexu.JPADemo.models.Author;
import io.github.larrythexu.JPADemo.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(
//			AuthorRepository authorRepository
//	) {
//		return args -> {
//			var author1 = Author.builder()
//					.firstName("test1")
//					.lastName("test1")
//					.age(20)
//					.email("test1@test.com")
//					.build();
//
//			authorRepository.save(author1);
//		};
//	}

}
