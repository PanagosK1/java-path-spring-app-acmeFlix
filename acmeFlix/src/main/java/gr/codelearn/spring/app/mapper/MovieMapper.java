package gr.codelearn.spring.app.mapper;




import gr.codelearn.spring.app.domain.Movie;
import gr.codelearn.spring.app.transfer.resource.MovieResource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MovieMapper extends BaseMapper<Movie, MovieResource>{
}
