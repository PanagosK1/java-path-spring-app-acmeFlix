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
        appendFieldValue(dataBuilder, String.valueOf(getViewedDuration()));
        appendFieldValue(dataBuilder, getDate().toString());


        return dataBuilder.toString();
    }
}