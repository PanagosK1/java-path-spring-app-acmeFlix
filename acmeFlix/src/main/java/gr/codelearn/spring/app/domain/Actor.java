package gr.codelearn.spring.app.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;
@Data
@SuperBuilder
@NoArgsConstructor
@Entity
public class Actor extends BaseModel{

    @Column(length = 50, nullable = false)
    private String fullname;

    @ManyToMany
    private List<Movie> movies;

    @ManyToMany
    private List<Serie> series;
}
