package gr.codelearn.spring.app.transfer.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportTop10 {

    private String Title;

    private int ViewCount;
}
