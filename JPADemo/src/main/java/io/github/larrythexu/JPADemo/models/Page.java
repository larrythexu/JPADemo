package io.github.larrythexu.JPADemo.models;

import io.github.larrythexu.JPADemo.models.footnotes.Footnote;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class Page extends BaseEntity {

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
