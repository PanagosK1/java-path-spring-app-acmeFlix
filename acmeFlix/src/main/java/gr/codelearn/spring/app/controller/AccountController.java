package gr.codelearn.spring.app.controller;


import gr.codelearn.spring.app.domain.Account;
import gr.codelearn.spring.app.mapper.BaseMapper;
import gr.codelearn.spring.app.service.BaseService;
import gr.codelearn.spring.app.transfer.resource.AccountResource;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("categories")
public class AccountController extends BaseController<Account, AccountResource> {
    @Override
    BaseService<Account, Long> getBaseService() {
        return null;
    }

    @Override
    BaseMapper<Account, AccountResource> getBaseMapper() {
        return null;
    }
}
