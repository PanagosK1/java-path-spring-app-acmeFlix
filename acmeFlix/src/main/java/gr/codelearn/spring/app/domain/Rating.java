package gr.codelearn.spring.app.domain;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Data
@SuperBuilder
@NoArgsConstructor
public class Rating extends BaseModel{

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Serie serie;
    @ManyToOne
    private Profile profile;

    @Min(0)
    @Max(10)
    @Column(nullable = false)
    private int rate;
    private String comment;
}
