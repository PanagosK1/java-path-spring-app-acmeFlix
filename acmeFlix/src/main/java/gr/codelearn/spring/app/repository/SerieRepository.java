package gr.codelearn.spring.app.repository;


import gr.codelearn.spring.app.domain.Episode;
import gr.codelearn.spring.app.domain.Movie;
import gr.codelearn.spring.app.domain.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SerieRepository extends JpaRepository<Serie,Long> {
    Serie findByTitle(String title);

    @Query(value = " SELECT TOP 10 SERIE.TITLE\n" +
            "FROM (\n" +
            "SELECT SERIE_ID, PROFILE_ID\n" +
            "from VIEW\n" +
            "where VIEW.SERIE_ID is not null\n" +
            " Group By SERIE_ID, PROFILE_ID)\n" +
            "INNER JOIN SERIE ON SERIE.ID = SERIE_ID\n" +
            "GROUP BY SERIE_ID\n" +
            "order by  count(*) desc", nativeQuery = true)
    List<String> findTop10ViewedSeries();

    @Query(value = " SELECT TOP 10 SERIE.TITLE\n" +
            "from RATING\n" +
            " INNER JOIN SERIE ON SERIE.ID = SERIE_ID\n" +
            " where RATING.SERIE_ID is not null\n" +
            "GROUP BY SERIE_ID\n" +
            "ORDER BY SUM(RATING.RATE) DESC", nativeQuery = true)
    List<String> findTop10RatedSeries();
}
