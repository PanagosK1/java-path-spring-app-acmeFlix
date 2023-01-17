package gr.codelearn.spring.app.service;

import gr.codelearn.spring.app.domain.Account;
import gr.codelearn.spring.app.repository.AccountRepository;
import gr.codelearn.spring.app.transfer.resource.Report;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl extends BaseServiceImpl<Account> implements AccountService{

    private final AccountRepository accountRepository;
    @Override
    JpaRepository<Account, Long> getRepository() {
        return null;
    }

    @Override
    public List<Report> getViewHoursPerProfile(Long accountId) {
        return accountRepository.getViewHoursPerProfile(accountId);
    }
}
