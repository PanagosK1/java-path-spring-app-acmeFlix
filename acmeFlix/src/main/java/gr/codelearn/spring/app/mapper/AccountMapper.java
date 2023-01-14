package gr.codelearn.spring.app.mapper;



import gr.codelearn.spring.app.domain.Account;
import gr.codelearn.spring.app.transfer.resource.AccountResource;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface AccountMapper extends BaseMapper<Account, AccountResource>{
}
