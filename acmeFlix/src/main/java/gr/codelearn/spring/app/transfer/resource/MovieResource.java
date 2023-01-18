package gr.codelearn.spring.app.transfer.resource;

import gr.codelearn.spring.app.transfer.resource.ContentResource;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class MovieResource extends ContentResource {
    @NotNull
    private int duration;


}
