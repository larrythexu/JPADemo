package io.github.larrythexu.JPADemo.repositories;

import io.github.larrythexu.JPADemo.models.Author;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer>, JpaSpecificationExecutor<Author> {
  // Named Queries
  @Transactional
  List<Author> findByNamedQuery(@Param("age") int age);

  // Dynamic Queries
  // We can concatenate different filters in the methods
  // select * from author where f_name = 'x'
  List<Author> findAllByFirstName(String firstName);
  // select * from author where f_name = 'X' (character case agnostic)
  List<Author> findAllByFirstNameIgnoreCase(String firstName);
  // select * from author where f_name like '%x%'
  List<Author> findAllByFirstNameIgnoreCaseContaining(String firstName);
  // select * from author where f_name like 'x%'
  List<Author> findAllByFirstNameStartsWithIgnoreCase(String firstName);

  // select * from author where f_name in ('test', 'larry', 'joe')
  List<Author> findAllByFirstNameInIgnoreCase(List<String> firstNames);

  // update Author a set a.age = 22 where a.id = 1
  @Transactional // Commits it to a Tx
  @Modifying // Makes Query accept `update`
  @Query("update Author a set a.age = :age where a.id = :id")
  int updateAuthor(int age, int id);
}
