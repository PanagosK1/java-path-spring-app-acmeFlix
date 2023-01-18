package gr.codelearn.spring.app.repository;



import gr.codelearn.spring.app.domain.Account;
import gr.codelearn.spring.app.transfer.resource.Report;
import gr.codelearn.spring.app.transfer.resource.ReportHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface AccountRepository extends JpaRepository<Account,Long>{

    @Query(value = "select new gr.codelearn.spring.app.transfer.resource.Report(p.id , p.username, SUM(v.viewedDuration))  " +
            "FROM View  v " +
            "JOIN v.profile p " +
            "JOIN  p.account a " +
            " where a.id = :accountId " +
            "GROUP BY p.id", nativeQuery = false)
    List<Report> getViewHoursPerProfile(Long accountId);

    @Query(value = "SELECT new gr.codelearn.spring.app.transfer.resource.ReportHistory(s.title,p.username,v.date) " +
            "FROM View  v " +
            "JOIN v.serie  s " +
            "JOIN  v.profile p " +
            "ORDER BY p.id, v.date DESC", nativeQuery = false)
    List<ReportHistory> getSeriesHistoryPerProfile();

    @Query(value = "SELECT new gr.codelearn.spring.app.transfer.resource.ReportHistory(m.title,p.username,v.date) " +
            "FROM View  v " +
            "JOIN v.movie  m " +
            "JOIN  v.profile p " +
            "ORDER BY p.id, v.date DESC", nativeQuery = false)
    List<ReportHistory> getMoviesHistoryPerProfile();
}
