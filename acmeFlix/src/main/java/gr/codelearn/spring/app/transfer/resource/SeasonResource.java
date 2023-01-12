package gr.codelearn.spring.app.transfer.resource;

import gr.codelearn.spring.app.transfer.resource.BaseResource;
import gr.codelearn.spring.app.transfer.resource.EpisodeResource;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
public class SeasonResource extends BaseResource {
    private List<EpisodeResource> episodes;

    private SerieResource serie;

    @NotNull
    private Integer season;
}
