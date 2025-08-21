package io.github.larrythexu.JPADemo.models.embedded;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Borrow {

  @EmbeddedId
  private BorrowId borrowId;

  @Embedded
  private Address address;

  private String borrowDetail;
  private String borrowNotes;
}
