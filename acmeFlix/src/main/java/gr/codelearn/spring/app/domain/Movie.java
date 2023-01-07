package gr.codelearn.spring.app.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@SuperBuilder
@Entity
public class Movie extends Content{

    @Column(nullable = false)
    private int duration;

}
