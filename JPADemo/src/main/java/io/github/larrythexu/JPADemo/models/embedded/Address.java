package io.github.larrythexu.JPADemo.models.embedded;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {

  private String streetName;
  private String unitNumber;
  private String postalCode;
}
