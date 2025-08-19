package io.github.larrythexu.JPADemo.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class Book extends BaseEntity {

  private String name;
  private String description;

  @ManyToMany
  @JoinTable(
      name = "authors_books",
      joinColumns = {
          @JoinColumn(name = "book_id")
      },
      inverseJoinColumns = {
          @JoinColumn(name = "author_id")
      }
  )
  private List<Author> authors;

  @OneToMany(mappedBy = "book")
  private List<Chapter> chapters;
}
