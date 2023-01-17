package gr.codelearn.spring.app.repository;



import gr.codelearn.spring.app.domain.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GenreRepository extends JpaRepository<Genre,Long> {

    @Query(value = "SELECT TOP 5 GENRE.CATEGORY\n" +
            "FROM MOVIE_GENRES \n" +
            "INNER JOIN GENRE ON GENRE.ID = MOVIE_GENRES.GENRES_ID\n" +
            "GROUP BY GENRES_ID\n" +
            "ORDER BY COUNT(*) DESC", nativeQuery = true)
    List<String> getMostPopularMoviesGenre();

    @Query(value = "SELECT TOP 5 GENRE.CATEGORY\n" +
            "FROM SERIE_GENRES \n" +
            "INNER JOIN GENRE ON GENRE.ID = SERIE_GENRES.GENRES_ID\n" +
            "GROUP BY GENRES_ID\n" +
            "ORDER BY COUNT(*) DESC", nativeQuery = true)
    List<String> getMostPopularSeriesGenre();
}
