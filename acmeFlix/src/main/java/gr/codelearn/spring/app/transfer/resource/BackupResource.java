package gr.codelearn.spring.app.transfer.resource;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
public class BackupResource extends BaseResource {
    @NotNull
    private String path;

    private Date date;
}
