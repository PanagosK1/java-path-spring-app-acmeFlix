package gr.codelearn.spring.app.service;

import gr.codelearn.spring.app.domain.Genre;
import gr.codelearn.spring.app.repository.GenreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl extends BaseServiceImpl<Genre> implements GenreService{

    private final GenreRepository genreRepository;

    @Override
    JpaRepository<Genre, Long> getRepository() {
        return genreRepository;
    }

    @Override
    public List<String> findTop5PopularMovieGenres() {
        return genreRepository.getMostPopularMoviesGenre();
    }

    @Override
    public List<String> findTop5PopularSerieGenres() {
        return genreRepository.getMostPopularSeriesGenre();
    }
}
