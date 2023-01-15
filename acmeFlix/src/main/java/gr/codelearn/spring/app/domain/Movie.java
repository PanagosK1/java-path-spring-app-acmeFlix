package gr.codelearn.spring.app.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Movie extends Content{

    @Column(nullable = false)
    private int duration;


    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany( mappedBy = "movie")
    private List<Rating> ratings;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany( mappedBy = "movie")
    private List<View> views;
}
