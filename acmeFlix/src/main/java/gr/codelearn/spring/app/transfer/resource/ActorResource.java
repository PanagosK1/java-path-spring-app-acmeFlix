package gr.codelearn.spring.app.transfer.resource;

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
public class ActorResource extends BaseResource {

    @NotNull
    private String fullname;

//    private List<MovieResource> movies;
//
//    private List<SerieResource> series;
}
