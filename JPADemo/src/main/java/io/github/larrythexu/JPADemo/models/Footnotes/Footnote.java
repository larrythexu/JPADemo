package io.github.larrythexu.JPADemo.models.Footnotes;

import io.github.larrythexu.JPADemo.models.BaseEntity;
import io.github.larrythexu.JPADemo.models.Page;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * For Demo purposes, we assume each page only has ONE footnote
 */

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "footnote_type")
public class Footnote extends BaseEntity {

  private int footnoteNumber;

  @OneToOne
  @JoinColumn(name = "page_id")
  private Page page;
}
