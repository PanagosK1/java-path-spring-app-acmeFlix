package gr.codelearn.spring.app.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@SuperBuilder
public class Season extends BaseModel{

    @OneToMany(mappedBy = "season")
    private List<Episode> episodes;

    @ManyToOne
    private Serie serie;

    @Column(nullable = false)
    private Integer season;

    @Override
    public String toString(){
        StringBuilder dataBuilder = new StringBuilder();
        appendFieldValue(dataBuilder, getId().toString());
        appendFieldValue(dataBuilder, getSerie().getId().toString());
        appendFieldValue(dataBuilder, String.valueOf(getSeason()));


        return dataBuilder.toString();
    }
}
