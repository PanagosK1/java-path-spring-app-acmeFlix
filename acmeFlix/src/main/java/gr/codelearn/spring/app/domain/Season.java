package gr.codelearn.spring.app.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Season extends BaseModel{

    @OneToMany(mappedBy = "season")
    private List<Episode> episodes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "serie_id")
    private Serie serie;

    @Column(nullable = false)
    private Integer season;

}
