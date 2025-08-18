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
public class Chapter {

  @Id
  @GeneratedValue
  private Integer id;

  private String name;
  private int chapterOrder;

  @ManyToOne
  @JoinColumn(name = "book_id")
  private Book book;

  @OneToMany(mappedBy = "chapter")
  private List<Page> pages;

}
