package gr.codelearn.spring.app.transfer.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ReportHistory {
    private String Title;
    private String Username;

    private LocalDateTime Date;
}
