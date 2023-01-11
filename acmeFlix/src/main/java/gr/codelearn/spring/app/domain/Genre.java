package gr.codelearn.spring.app.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Genre extends BaseModel{

    @Column(nullable = false)
    private String category;

    @ManyToMany(mappedBy = "genres")
    private List<Movie> movies;

    @ManyToMany(mappedBy = "genres")
    private List<Serie> series;
}
