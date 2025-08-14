package io.github.larrythexu.JPADemo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}
