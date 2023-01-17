package gr.codelearn.spring.app.service;

import gr.codelearn.spring.app.domain.Account;
import gr.codelearn.spring.app.transfer.resource.Report;
import org.springframework.data.util.Pair;

import java.util.HashMap;
import java.util.List;

public interface AccountService extends BaseService<Account, Long>{

    List<Report> getViewHoursPerProfile(Long accountId);
}
