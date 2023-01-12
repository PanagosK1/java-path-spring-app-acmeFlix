package gr.codelearn.spring.app.mapper;




import gr.codelearn.spring.app.domain.Season;
import gr.codelearn.spring.app.transfer.resource.SeasonResource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SeasonMapper extends BaseMapper<Season, SeasonResource>{
}
