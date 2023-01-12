package gr.codelearn.spring.app.mapper;




import gr.codelearn.spring.app.domain.Genre;
import gr.codelearn.spring.app.transfer.resource.GenreResource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GenreMapper extends BaseMapper<Genre, GenreResource>{
}
