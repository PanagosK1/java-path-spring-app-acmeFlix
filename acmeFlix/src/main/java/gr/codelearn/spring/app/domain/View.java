package gr.codelearn.spring.app.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.context.annotation.Profile;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@SuperBuilder
public class View extends BaseModel{

    @Column(nullable = false)
    private double viewedDuration;

    @ManyToOne
    private Profile profile;

    @ManyToOne
    private Content content;

    private LocalDateTime date;

}