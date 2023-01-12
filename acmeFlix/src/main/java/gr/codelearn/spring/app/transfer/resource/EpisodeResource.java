package gr.codelearn.spring.app.transfer.resource;



import gr.codelearn.spring.app.domain.Season;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString(callSuper = true)
public class EpisodeResource extends BaseResource {
    @NotNull
    private Integer duration;

    private Season season;

    @NotNull
    private String epTitle;
}
