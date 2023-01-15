package gr.codelearn.spring.app.controller;


import gr.codelearn.spring.app.domain.Account;
import gr.codelearn.spring.app.mapper.AccountMapper;
import gr.codelearn.spring.app.mapper.BaseMapper;
import gr.codelearn.spring.app.service.AccountService;
import gr.codelearn.spring.app.service.BaseService;
import gr.codelearn.spring.app.transfer.resource.AccountResource;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("accounts")
public class AccountController extends BaseController<Account, AccountResource> {

    private final AccountService accountService;
    private final AccountMapper accountMapper;

    @Override
    protected BaseService<Account, Long> getBaseService() {
        return accountService;
    }

    @Override
    protected BaseMapper<Account, AccountResource> getBaseMapper() {
        return accountMapper;
    }
}
