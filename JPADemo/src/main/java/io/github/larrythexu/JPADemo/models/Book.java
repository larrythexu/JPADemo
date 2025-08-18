package io.github.larrythexu.JPADemo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Book {

  @Id
  @GeneratedValue
  private Integer id;
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
