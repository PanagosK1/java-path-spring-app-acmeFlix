package gr.codelearn.spring.app.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@SuperBuilder
@Entity
public class Genre extends BaseModel{

    @Column(nullable = false)
    private String category;

    @ManyToMany
    private List<Content> contents;
}
