package gr.codelearn.spring.app.service;

import gr.codelearn.spring.app.domain.Account;
import gr.codelearn.spring.app.domain.Movie;
import gr.codelearn.spring.app.repository.AccountRepository;
import gr.codelearn.spring.app.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl extends BaseServiceImpl<Movie> implements MovieService{
    private final MovieRepository movieRepository;

    @Override
    JpaRepository<Movie, Long> getRepository() {
        return movieRepository;
    }

    @Override
    public List<Movie> findAllLazy() {
        return movieRepository.findAllLazy();
    }

    @Override
    public Movie findByTitle(String title) {
        return Optional.ofNullable(movieRepository.findByTitle(title)).orElseThrow(
                NoSuchElementException::new);
    }
}
