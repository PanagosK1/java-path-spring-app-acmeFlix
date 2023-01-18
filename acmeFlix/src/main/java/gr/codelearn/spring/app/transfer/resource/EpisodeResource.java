package gr.codelearn.spring.app.transfer.resource;



import gr.codelearn.spring.app.domain.Season;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
public class EpisodeResource extends BaseResource {
    @NotNull
    private Integer duration;


    @NotNull
    private String Title;
    private String SerieTitle;
}
