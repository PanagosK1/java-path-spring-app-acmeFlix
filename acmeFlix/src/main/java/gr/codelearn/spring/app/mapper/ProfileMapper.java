package gr.codelearn.spring.app.mapper;




import gr.codelearn.spring.app.domain.Profile;
import gr.codelearn.spring.app.transfer.resource.ProfileResource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProfileMapper extends BaseMapper<Profile, ProfileResource>{
}
