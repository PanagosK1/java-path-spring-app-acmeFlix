package gr.codelearn.spring.app.transfer.resource;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString(callSuper = true)
public class RatingResource extends BaseResource {
    private MovieResource movie;

    private SerieResource serie;

    private ProfileResource profile;

    @NotNull
    private int rate;
    private String comment;
}
