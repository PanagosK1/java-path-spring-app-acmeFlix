package gr.codelearn.spring.app.mapper;




import gr.codelearn.spring.app.domain.Backup;
import gr.codelearn.spring.app.transfer.resource.BackupResource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BackupMapper extends BaseMapper<Backup, BackupResource>{
}
