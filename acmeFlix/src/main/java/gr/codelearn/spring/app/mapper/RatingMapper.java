package gr.codelearn.spring.app.mapper;




import gr.codelearn.spring.app.domain.Rating;
import gr.codelearn.spring.app.transfer.resource.RatingResource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RatingMapper extends BaseMapper<Rating, RatingResource>{
}
