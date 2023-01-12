package gr.codelearn.spring.app.mapper;




import gr.codelearn.spring.app.domain.Episode;
import gr.codelearn.spring.app.transfer.resource.EpisodeResource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EpisodeMapper extends BaseMapper<Episode, EpisodeResource>{
}
