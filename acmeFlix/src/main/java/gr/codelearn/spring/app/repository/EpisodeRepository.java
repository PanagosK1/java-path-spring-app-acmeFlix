package gr.codelearn.spring.app.repository;

import gr.codelearn.spring.app.domain.Episode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EpisodeRepository extends JpaRepository<Episode,Long> {

    @Query(value = "  SELECT ep.ID, ep.TITLE, ep.DURATION, ep.SEASON_ID \n" +
            "FROM EPISODE as ep\n" +
            "INNER JOIN SEASON as s\n" +
            "ON ep.SEASON_ID = s.ID\n" +
            "INNER JOIN SERIE as se\n" +
            " ON s.SERIE_ID = se.ID\n" +
            "WHERE   ep.TITLE = :episodeTitle  AND se.TITLE = :serieTitle", nativeQuery = true)
    Episode findEpisodeByTitle(String serieTitle, String episodeTitle);
}
