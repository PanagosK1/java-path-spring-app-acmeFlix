package gr.codelearn.spring.app.transfer.resource;

import gr.codelearn.spring.app.transfer.resource.BaseResource;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
public class GenreResource extends BaseResource {
    @NotNull
    private String category;

}
