package gr.codelearn.spring.app.repository;


import gr.codelearn.spring.app.domain.Season;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeasonRepository extends JpaRepository<Season,Long> {
}
