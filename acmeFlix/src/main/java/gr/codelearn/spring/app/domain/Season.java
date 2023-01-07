package gr.codelearn.spring.app.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Season extends BaseModel{

    @OneToMany(mappedBy = "season")
    private List<Episode> episodes;

    @ManyToOne
    private Serie serie;

    @Column(nullable = false)
    private Integer season;

}
