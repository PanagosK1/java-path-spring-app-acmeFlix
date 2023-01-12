package gr.codelearn.spring.app.repository;



import gr.codelearn.spring.app.domain.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre,Long> {
}
