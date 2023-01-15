package gr.codelearn.spring.app.transfer.resource;

import gr.codelearn.spring.app.transfer.resource.ActorResource;
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
public class ContentResource extends BaseResource {

    @NotNull
    private String title;

    @NotNull
    private int yearPublished;

    @NotNull
    private int ageRestriction;

    private List<GenreResource> genres;

    private List<ActorResource> actors;
}
