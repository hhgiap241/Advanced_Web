package org.hcmus.ln02.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ActorDto {
  private Long id;
  private String firstName;
  private String lastName;
}
