package io.github.larrythexu.JPADemo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Page {

  @Id
  @GeneratedValue
  private Integer id;

  private int pageNumber;
  private String firstWord;

  @ManyToOne
  @JoinColumn(name = "chapter_id")
  private Chapter chapter;

  // For demo purposes, we assume pages only have 1 footnote
  @OneToOne
  @JoinColumn(name = "footnote_id")
  private Footnote footnote;
}
