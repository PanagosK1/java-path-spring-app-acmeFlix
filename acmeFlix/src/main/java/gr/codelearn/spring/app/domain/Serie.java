package gr.codelearn.spring.app.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@Data
@SuperBuilder
@Entity
public class Serie extends Content{

    @OneToMany(mappedBy = "seasons")
    private List<Season> seasons;
}
