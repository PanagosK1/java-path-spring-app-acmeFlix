package gr.codelearn.spring.app.repository;



import gr.codelearn.spring.app.domain.Backup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BackUpRepository extends JpaRepository<Backup,Long> {
}
