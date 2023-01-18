package gr.codelearn.spring.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


import java.util.List;
@Data
@SuperBuilder
@NoArgsConstructor
@Entity
public class Actor extends BaseModel {

    @Column(length = 50, nullable = false)
    private String fullname;

    @Override
    public String toString(){
        StringBuilder dataBuilder = new StringBuilder();
        appendFieldValue(dataBuilder, getId().toString());
        appendFieldValue(dataBuilder, getFullname());


        return dataBuilder.toString();
    }
}
