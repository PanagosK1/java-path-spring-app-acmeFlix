package gr.codelearn.spring.app.mapper;




import gr.codelearn.spring.app.domain.Serie;
import gr.codelearn.spring.app.transfer.resource.SerieResource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SerieMapper extends BaseMapper<Serie, SerieResource>{
}
