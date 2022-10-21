package org.hcmus.ln02.model.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@Entity
@Table(name = "film")
@NoArgsConstructor
public class Film {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "film_id", columnDefinition = "SMALLINT(5) UNSIGNED", nullable = false)
  private Long filmId;
  @Column(name = "title", columnDefinition = "VARCHAR(255)", nullable = false)
  private String title;
  @Column(name = "description", columnDefinition = "TEXT")
  private String description;
  @Column(name = "release_year", columnDefinition = "YEAR(4) default null")
  private Integer releaseYear;
  @Column(name = "language_id", columnDefinition = "TINYINT(3) UNSIGNED", nullable = false)
  private Long languageId;
  @Column(name = "original_language_id", columnDefinition = "TINYINT(3) UNSIGNED default null")
  private Long originalLanguageId;
  @Column(name = "rental_duration", columnDefinition = "TINYINT(3) UNSIGNED default 3", nullable = false)
  private Long rentalDuration;
  @Column(name = "rental_rate", columnDefinition = "DECIMAL(4,2) default 4.99", nullable = false)
  private Double rentalRate;
  @Column(name = "length", columnDefinition = "SMALLINT(5) UNSIGNED default null")
  private Long length;
  @Column(name = "replacement_cost", columnDefinition = "DECIMAL(5,2) default 19.99", nullable = false)
  private Double replacementCost;
  @Column(name = "rating", columnDefinition = "ENUM('G','PG','PG-13','R','NC-17') default 'G'")
  private String rating;
  @Column(name = "special_features", columnDefinition = "SET('Trailers','Commentaries','Deleted Scenes','Behind the Scenes') default null")
  private String specialFeatures;
  @UpdateTimestamp
  @Column(name = "last_update", columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP", nullable = false)
  private LocalDateTime lastUpdate;
}
