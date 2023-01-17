package gr.codelearn.spring.app.service;

import gr.codelearn.spring.app.domain.Account;
import gr.codelearn.spring.app.domain.Episode;
import gr.codelearn.spring.app.domain.Movie;
import gr.codelearn.spring.app.domain.Serie;

import java.util.List;

public interface SerieService extends BaseService<Serie, Long>{

    Serie findByTitle(String title);

    List<String> findTop10ViewedSeries();
    List<String> findTop10RatedSeries();
}
