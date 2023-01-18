package gr.codelearn.spring.app.service;

import gr.codelearn.spring.app.domain.Account;
import gr.codelearn.spring.app.transfer.resource.Report;
import gr.codelearn.spring.app.transfer.resource.ReportHistory;
import gr.codelearn.spring.app.transfer.resource.ReportHistoryModel;

import java.util.List;

public interface AccountService extends BaseService<Account, Long>{

    List<Report> getViewHoursPerProfile(Long accountId);

    List<ReportHistoryModel> getHistoryPerAccount();
}
