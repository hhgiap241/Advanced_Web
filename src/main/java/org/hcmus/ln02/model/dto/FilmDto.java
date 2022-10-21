package org.hcmus.ln02.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class FilmDto {
  private Long filmId;
  private String title;
  private String description;
  private Integer releaseYear;
  private Long languageId;
  private Long originalLanguageId;
  private Long rentalDuration;
  private Double rentalRate;
  private Long length;
  private Double replacementCost;
  private String rating;
  private String specialFeatures;
}
