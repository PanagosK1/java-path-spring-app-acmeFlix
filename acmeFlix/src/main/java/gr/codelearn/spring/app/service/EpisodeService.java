package gr.codelearn.spring.app.service;

import gr.codelearn.spring.app.domain.Episode;
import gr.codelearn.spring.app.domain.Serie;

public interface EpisodeService extends BaseService<Episode, Long>{
    Episode findEpisodeByTitle(String serieTitle, String episodeTitle);
}
