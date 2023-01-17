package gr.codelearn.spring.app.service;

import gr.codelearn.spring.app.domain.Account;
import gr.codelearn.spring.app.domain.Movie;
import gr.codelearn.spring.app.repository.AccountRepository;
import gr.codelearn.spring.app.repository.MovieRepository;
import gr.codelearn.spring.app.transfer.resource.ReportTop10;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Service;

import javax.swing.*;
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
    public Movie findByTitle(String title) {
        return movieRepository.findByTitle(title);
    }

    @Override
    public List<String> findTop10ViewedMovies() {
        return movieRepository.findTop10ViewedMovies();
    }

    @Override
    public List<String> findTop10RatedMovies() {
        return movieRepository.findTop10RatedMovies();
    }


}
