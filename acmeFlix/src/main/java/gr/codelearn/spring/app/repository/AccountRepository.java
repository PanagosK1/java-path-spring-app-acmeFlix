package gr.codelearn.spring.app.repository;



import gr.codelearn.spring.app.domain.Account;
import gr.codelearn.spring.app.domain.Actor;
import gr.codelearn.spring.app.transfer.resource.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.util.Pair;

import java.util.HashMap;
import java.util.List;


public interface AccountRepository extends JpaRepository<Account,Long>{

    @Query(value = "select new gr.codelearn.spring.app.transfer.resource.Report(p.id , SUM(v.viewedDuration))  " +
            "FROM View  v " +
            "JOIN v.profile p " +
            "JOIN  p.account a " +
            " where a.id = :accountId " +
            "GROUP BY p.id", nativeQuery = false)
    List<Report> getViewHoursPerProfile(Long accountId);
}
