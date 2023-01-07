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
public class Actor extends BaseModel{

    @Column(length = 50, nullable = false)
    private String fullname;

    @ManyToMany
    private List<Content> contents;
}
