package gr.codelearn.spring.app.transfer.resource;

import gr.codelearn.spring.app.transfer.resource.ContentResource;
import gr.codelearn.spring.app.transfer.resource.RatingResource;
import gr.codelearn.spring.app.transfer.resource.SeasonResource;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
public class SerieResource extends ContentResource {

}
