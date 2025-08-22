package io.github.larrythexu.JPADemo.specifications;

import io.github.larrythexu.JPADemo.models.Author;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

public class AuthorSpecification {

  // Verify if author has specified age
  public static Specification<Author> hasAge(int age) {
    return (
        Root<Author> root,
        CriteriaQuery<?> query,
        CriteriaBuilder builder
    ) -> {
      if (age < 0) {
        return null;
      }
      return builder.equal(root.get("age"), age);
    };
  }

  // Verify author's first name contains string
  public static Specification<Author> firstNameLike(String name) {
    return (
        Root<Author> root,
        CriteriaQuery<?> query,
        CriteriaBuilder builder
    ) -> {
      if (name == null) {
        return null;
      }
      return builder.like(root.get("firstName"), "%" + name + "%");
    };
  }
}
