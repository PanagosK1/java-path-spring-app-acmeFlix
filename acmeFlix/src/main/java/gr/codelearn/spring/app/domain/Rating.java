package gr.codelearn.spring.app.domain;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Data
@SuperBuilder
@NoArgsConstructor
public class Rating extends BaseModel{

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Serie serie;
    @ManyToOne
    private Profile profile;

    @Min(0)
    @Max(10)
    @Column(nullable = false)
    private int rate;
    private String comment;

    @Override
    public String toString(){
        StringBuilder dataBuilder = new StringBuilder();
        appendFieldValue(dataBuilder, getId().toString());
        if(getMovie() != null){
            appendFieldValue(dataBuilder, getMovie().getId().toString());
        }else{
            appendFieldValue(dataBuilder, "null");
        }
        if(getSerie() != null){
            appendFieldValue(dataBuilder, getSerie().getId().toString());
        }else{
            appendFieldValue(dataBuilder, "null");
        }

        appendFieldValue(dataBuilder, getProfile().getId().toString());
        appendFieldValue(dataBuilder, String.valueOf(getRate()));
        appendFieldValue(dataBuilder, getComment());


        return dataBuilder.toString();
    }
}
