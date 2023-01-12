package gr.codelearn.spring.app.repository;


import gr.codelearn.spring.app.domain.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile,Long> {
}
