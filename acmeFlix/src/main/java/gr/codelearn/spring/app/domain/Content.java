package gr.codelearn.spring.app.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Content extends BaseModel{
    @NotNull(message = "Content title's cannot be null")
    @Column(length = 50, nullable = false, unique = true)
    private String title;

    @Column(length = 4, nullable = false)
    private int yearPublished;

    @Min(3)
    @Max(18)
    @Column(nullable = false)
    private int ageRestriction;

    @ManyToMany(mappedBy = "contents")
    private List<Genre> genres;

    @ManyToMany(mappedBy = "contents")
    private List<Actor> actors;

    @ManyToOne
    private List<Rating> ratings;

}
