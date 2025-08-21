package io.github.larrythexu.JPADemo;

import com.github.javafaker.Faker;
import io.github.larrythexu.JPADemo.models.Author;
import io.github.larrythexu.JPADemo.repositories.AuthorRepository;
import io.github.larrythexu.JPADemo.repositories.LinkRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class JpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository authorRepository,
			LinkRepository linkRepository
	) {
		return args -> {
			for (int i = 0; i < 50; i++) {
				// Utility class to fake data
				Faker faker = new Faker();
				var author = Author.builder()
						.firstName(faker.name().firstName())
						.lastName(faker.name().lastName())
						.age(faker.number().numberBetween(10, 80))
						.email(faker.name().username() + "@larrycode.com")
						.build();

				authorRepository.save(author);
			}
			// We can override/update an existing author, as long as ID is matching
//			var author = Author.builder()
//					.id(1)
//					.firstName("joe")
//					.lastName("schmoe")
//					.age(25)
//					.email("joego@larrycode.com")
//					.build();
//			authorRepository.save(author);

			// Now using JPA Repo methods
			// update Author a set a.age = 22 where a.id = 1
			authorRepository.updateAuthor(28, 1);

//			var link = Link.builder()
//					.URL("test.com")
//					.footnoteNumber(5)
//					.build();
//			linkRepository.save(link);
		};
	}

}
