package gr.codelearn.spring.app.repository;


import gr.codelearn.spring.app.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MovieRepository extends JpaRepository<Movie,Long> {

}
