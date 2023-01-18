package gr.codelearn.spring.app.service;

import gr.codelearn.spring.app.domain.Account;
import gr.codelearn.spring.app.domain.Profile;
import gr.codelearn.spring.app.repository.AccountRepository;
import gr.codelearn.spring.app.repository.ProfileRepository;
import gr.codelearn.spring.app.transfer.resource.ProfileResource;
import gr.codelearn.spring.app.transfer.resource.Report;
import gr.codelearn.spring.app.transfer.resource.ReportHistory;
import gr.codelearn.spring.app.transfer.resource.ReportHistoryModel;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl extends BaseServiceImpl<Account> implements AccountService{

    private final AccountRepository accountRepository;
    private final ProfileRepository profileRepository;
    @Override
    JpaRepository<Account, Long> getRepository() {
        return accountRepository;
    }

    @Override
    public List<Report> getViewHoursPerProfile(Long accountId) {
        return accountRepository.getViewHoursPerProfile(accountId);
    }

    @Override
    public List<ReportHistoryModel> getHistoryPerAccount() {
        List<ReportHistory> history = new ArrayList<ReportHistory>();
        history.addAll(accountRepository.getMoviesHistoryPerProfile());
        history.addAll(accountRepository.getSeriesHistoryPerProfile());

        List<Account> accounts = accountRepository.findAll();

        List<ReportHistoryModel> results = new ArrayList<ReportHistoryModel>();

        for(Account account : accounts){
            List<Profile> accountProfiles = profileRepository.findAllById(account.getId());
            ReportHistoryModel model = new ReportHistoryModel();
            model.setEmail(account.getEmail());

            List<ReportHistory> historyForProfile = new ArrayList<>();
            for(Profile p : accountProfiles){

                for(ReportHistory r : history){
                    if(r.getUsername() == p.getUsername()){
                        historyForProfile.add(r);
                    }
                }

            }
            model.setHistory(historyForProfile);
            results.add(model);
        }



        return results;
    }
}
