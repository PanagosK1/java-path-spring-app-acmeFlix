package gr.codelearn.spring.app.mapper;



import gr.codelearn.spring.app.domain.View;
import gr.codelearn.spring.app.transfer.resource.ViewResource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ViewMapper extends BaseMapper<View, ViewResource>{
}
