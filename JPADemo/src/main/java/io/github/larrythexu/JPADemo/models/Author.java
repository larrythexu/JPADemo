package io.github.larrythexu.JPADemo.models;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@NamedQuery(
    name = "Author.findByNamedQuery",
    query = "select a from Author a where a.age >= :age"
)
public class Author extends BaseEntity {

  @Column(
      name = "f_name", // the name of the column in the DB
      length = 35 // max length
  )
  private String firstName;
  private String lastName;

  @Column(
      unique = true,
      nullable = false
  )
  private String email;
  private int age;

  @ManyToMany(mappedBy = "authors")
  private List<Book> books;

//  @Column(
//      updatable = false,
//      nullable = false
//  )
//  private LocalDateTime createdAt;
//
//  @Column(
//      insertable = false // We don't want JPA to be inserting this value, it should be handled by the DB
//  )
//  private LocalDateTime lastModifiedAt;
}
