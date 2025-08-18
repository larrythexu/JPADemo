package io.github.larrythexu.JPADemo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * For Demo purposes, we assume each page only has ONE footnote
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Footnote {

  @Id
  @GeneratedValue
  private Integer id;
  private int footnoteNumber;
  private String note;

  @OneToOne
  @JoinColumn(name = "page_id")
  private Page page;
}
