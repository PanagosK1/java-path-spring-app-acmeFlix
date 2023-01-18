package gr.codelearn.spring.app.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Episode extends BaseModel {

    @Column(nullable = false)
    private Integer duration;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "season_id")
    private Season season;

    @Column(nullable = false)
    private String Title;

    @Override
    public String toString(){
        StringBuilder dataBuilder = new StringBuilder();
        appendFieldValue(dataBuilder, getId().toString());
        appendFieldValue(dataBuilder, String.valueOf(getDuration()));
        appendFieldValue(dataBuilder, getSeason().getId().toString());
        appendFieldValue(dataBuilder, getTitle());


        return dataBuilder.toString();
    }
}
