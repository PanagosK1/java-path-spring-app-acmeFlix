package gr.codelearn.spring.app.domain;

import javax.persistence.*;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@Entity
public class Episode extends BaseModel {

    @Column(nullable = false)
    private Integer duration;

    @ManyToOne
    private Season season;

    @Column(nullable = false)
    private String epTitle;
}
