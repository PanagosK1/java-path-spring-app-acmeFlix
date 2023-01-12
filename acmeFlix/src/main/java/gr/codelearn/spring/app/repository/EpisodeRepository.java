package gr.codelearn.spring.app.repository;

import gr.codelearn.spring.app.domain.Episode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpisodeRepository extends JpaRepository<Episode,Long> {
}
