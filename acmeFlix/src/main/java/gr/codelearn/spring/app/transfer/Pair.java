package gr.codelearn.spring.app.transfer;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Pair {
    private Long firstId;

    private Long secondId;

    @Override
    public String toString(){
        StringBuilder dataBuilder = new StringBuilder();
        appendFieldValue(dataBuilder, String.valueOf(getFirstId()));
        appendFieldValue(dataBuilder, String.valueOf(getSecondId()));


        return dataBuilder.toString();
    }

    protected void appendFieldValue(StringBuilder dataBuilder, String fieldValue) {
        if(fieldValue != null) {
            dataBuilder.append(fieldValue).append(",");
        } else {
            dataBuilder.append("").append(",");
        }
    }
}
