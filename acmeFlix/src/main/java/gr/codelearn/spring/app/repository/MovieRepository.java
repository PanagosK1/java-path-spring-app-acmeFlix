package gr.codelearn.spring.app.repository;


import gr.codelearn.spring.app.domain.Movie;
import gr.codelearn.spring.app.transfer.resource.ReportTop10;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.util.Pair;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie,Long> {
    Movie findByTitle(String title);


    @Query(value = " select TOP 10 MOVIE.TITLE \n" +
            "from VIEW\n" +
            "inner join MOVIE ON MOVIE.ID = VIEW.MOVIE_ID\n" +
            "where VIEW.MOVIE_ID is not null\n" +
            " Group By MOVIE_ID\n" +
            "order by  count(*) desc", nativeQuery = true)
    List<String> findTop10ViewedMovies();

    @Query(value = " SELECT TOP 10 MOVIE.TITLE\n" +
            "from RATING\n" +
            " INNER JOIN MOVIE ON MOVIE.ID = MOVIE_ID\n" +
            " where RATING.MOVIE_ID is not null\n" +
            "GROUP BY MOVIE_ID\n" +
            "ORDER BY SUM(RATING.RATE) DESC", nativeQuery = true)
    List<String> findTop10RatedMovies();
}
