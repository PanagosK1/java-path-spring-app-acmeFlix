package gr.codelearn.spring.app.repository;


import gr.codelearn.spring.app.domain.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProfileRepository extends JpaRepository<Profile,Long> {

    @Query(value = " select * \n" +
            "from PROFILE p\n" +
            "where p.ACCOUNT_ID = :accountId\n", nativeQuery = true)
    List<Profile> findAllById(Long accountId);
}
