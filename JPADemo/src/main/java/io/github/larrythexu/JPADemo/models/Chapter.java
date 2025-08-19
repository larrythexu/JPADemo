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
public class Chapter extends BaseEntity {

  private String name;
  private int chapterOrder;

  @ManyToOne
  @JoinColumn(name = "book_id")
  private Book book;

  @OneToMany(mappedBy = "chapter")
  private List<Page> pages;

}
