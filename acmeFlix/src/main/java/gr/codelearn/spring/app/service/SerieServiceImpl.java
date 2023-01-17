package gr.codelearn.spring.app.service;

import gr.codelearn.spring.app.domain.Account;
import gr.codelearn.spring.app.domain.Episode;
import gr.codelearn.spring.app.domain.Movie;
import gr.codelearn.spring.app.domain.Serie;
import gr.codelearn.spring.app.repository.AccountRepository;
import gr.codelearn.spring.app.repository.SerieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SerieServiceImpl extends BaseServiceImpl<Serie> implements SerieService{
    private final SerieRepository serieRepository;

    @Override
    JpaRepository<Serie, Long> getRepository() {
        return null;
    }

    public Serie findByTitle(String title) {
        return serieRepository.findByTitle(title);
    }

    @Override
    public List<String> findTop10ViewedSeries() {
        return serieRepository.findTop10ViewedSeries();
    }

    @Override
    public List<String> findTop10RatedSeries() {
        return serieRepository.findTop10RatedSeries();
    }


}
