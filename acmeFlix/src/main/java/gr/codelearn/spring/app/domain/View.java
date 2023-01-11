package gr.codelearn.spring.app.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.context.annotation.Profile;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class View extends BaseModel{

    @Column(nullable = false)
    private double viewedDuration;

    private LocalDateTime date;

}