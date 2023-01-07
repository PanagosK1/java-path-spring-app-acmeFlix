package gr.codelearn.spring.app.domain;

import jakarta.validation.constraints.Min;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;

@Entity
@Data
@SuperBuilder
public class Rating extends  BaseModel{

    @OneToMany(mappedBy = "ratings")
    private Content content;

    @OneToMany(mappedBy = "ratings")
    private Profile profile;

    @Min(0)
    @Max(10)
    @Column(nullable = false)
    private int rate;
    private String comment;
}
