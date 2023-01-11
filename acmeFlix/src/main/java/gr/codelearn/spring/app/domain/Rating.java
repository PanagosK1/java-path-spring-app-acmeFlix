package gr.codelearn.spring.app.domain;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Data
@SuperBuilder
@NoArgsConstructor
public class Rating extends BaseModel{

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "serie_id")
    private Serie serie;
    @ManyToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;

    @Min(0)
    @Max(10)
    @Column(nullable = false)
    private int rate;
    private String comment;
}
