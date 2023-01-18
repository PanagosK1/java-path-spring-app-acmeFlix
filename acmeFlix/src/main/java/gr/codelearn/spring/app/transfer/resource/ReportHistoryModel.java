package gr.codelearn.spring.app.transfer.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ReportHistoryModel {

    private String email;

    private List<ReportHistory> history;
}
