package gr.codelearn.spring.app.transfer.resource;

import gr.codelearn.spring.app.transfer.resource.ContentResource;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
public class MovieResource extends ContentResource {
    @NotNull
    private int duration;

    private List<RatingResource> ratings;

    private List<ViewResource> views;
}
