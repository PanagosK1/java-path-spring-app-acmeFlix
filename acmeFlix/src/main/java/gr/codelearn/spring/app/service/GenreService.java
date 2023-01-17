package gr.codelearn.spring.app.service;

import gr.codelearn.spring.app.domain.Genre;

import java.util.List;

public interface GenreService extends BaseService<Genre, Long>{

    List<String> findTop5PopularMovieGenres();
    List<String> findTop5PopularSerieGenres();

}
