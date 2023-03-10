package gr.codelearn.spring.app.transfer.resource;

import gr.codelearn.spring.app.transfer.resource.BaseResource;
import gr.codelearn.spring.app.transfer.resource.MovieResource;
import gr.codelearn.spring.app.transfer.resource.ProfileResource;
import gr.codelearn.spring.app.transfer.resource.SerieResource;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
public class ViewResource extends BaseResource {
    @NotNull
    private double viewedDuration;

    private LocalDateTime date;

    private ProfileResource profile;


}
