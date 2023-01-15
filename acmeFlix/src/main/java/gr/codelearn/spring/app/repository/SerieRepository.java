package gr.codelearn.spring.app.repository;


import gr.codelearn.spring.app.domain.Episode;
import gr.codelearn.spring.app.domain.Movie;
import gr.codelearn.spring.app.domain.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SerieRepository extends JpaRepository<Serie,Long> {
    Serie findByTitle(String title);


}
