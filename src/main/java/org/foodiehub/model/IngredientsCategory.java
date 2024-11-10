package org.foodiehub.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Table(name = "ingredientsCategories")
public class IngredientsCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    private List<IngredientsItem> ingredients = new ArrayList<>();

    @JsonIgnore
    @ManyToOne
    private Restaurant restaurant;

}
