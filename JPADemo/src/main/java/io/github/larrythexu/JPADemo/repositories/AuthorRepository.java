package io.github.larrythexu.JPADemo.repositories;

import io.github.larrythexu.JPADemo.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
