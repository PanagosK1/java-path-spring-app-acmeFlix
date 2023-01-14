package gr.codelearn.spring.app.repository;


import gr.codelearn.spring.app.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie,Long> {
    Movie findByTitle(String title);

    @Query("select distinct o from Movie o join fetch o.views ")
    List<Movie> findAllLazy();
}
