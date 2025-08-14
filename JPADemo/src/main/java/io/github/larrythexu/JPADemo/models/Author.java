package io.github.larrythexu.JPADemo.models;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
public class Author {

  @Id // Set primary key
  @GeneratedValue
  private Integer id; // use Integer because it can be null, for hibernate to autogen ids

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

  @Column(
      updatable = false,
      nullable = false
  )
  private LocalDateTime createdAt;

  @Column(
      insertable = false // We don't want JPA to be inserting this value, it should be handled by the DB
  )
  private LocalDateTime lastModifiedAt;
}
