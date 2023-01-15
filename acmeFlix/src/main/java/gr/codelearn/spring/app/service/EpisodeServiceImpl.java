package gr.codelearn.spring.app.service;

import gr.codelearn.spring.app.domain.Account;
import gr.codelearn.spring.app.domain.Episode;
import gr.codelearn.spring.app.repository.EpisodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EpisodeServiceImpl extends BaseServiceImpl<Episode> implements EpisodeService{

    private final EpisodeRepository episodeRepository;
    @Override
    JpaRepository<Episode, Long> getRepository() {
        return episodeRepository;
    }

    @Override
    public Episode findEpisodeByTitle(String serieTitle, String episodeTitle) {
        return episodeRepository.findEpisodeByTitle(serieTitle, episodeTitle);
    }
}
