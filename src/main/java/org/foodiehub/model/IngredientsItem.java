package org.foodiehub.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Table(name = "ingredientsItems")
public class IngredientsItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private IngredientsCategory category;

    @JsonIgnore
    @ManyToOne
    private Restaurant restaurant;

    private boolean inStock = true;
}
