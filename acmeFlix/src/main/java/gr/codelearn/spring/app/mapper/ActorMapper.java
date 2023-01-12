package gr.codelearn.spring.app.mapper;




import gr.codelearn.spring.app.domain.Actor;
import gr.codelearn.spring.app.transfer.resource.ActorResource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ActorMapper extends BaseMapper<Actor, ActorResource>{
}
