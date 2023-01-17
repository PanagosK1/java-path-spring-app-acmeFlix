package gr.codelearn.spring.app.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class View extends BaseModel{

    @Column(nullable = false)
    private int viewedDuration;

    private LocalDateTime date;

    @ManyToOne
    private Profile profile;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Serie serie;

}