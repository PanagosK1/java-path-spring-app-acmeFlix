package gr.codelearn.spring.app.repository;

import gr.codelearn.spring.app.domain.Account;
import gr.codelearn.spring.app.domain.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
public interface SerieRepository extends JpaRepository<Serie,Long> {
}
