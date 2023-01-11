package gr.codelearn.spring.app.service;


import gr.codelearn.spring.app.domain.Movie;
import gr.codelearn.spring.app.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import org.springframework.data.jpa.repository.JpaRepository;


@Service
@RequiredArgsConstructor
public class MovieServiceImpl extends BaseServiceImpl<Movie> implements MovieService {

    private final MovieRepository movieRepository;
    
    @Override
    JpaRepository<Movie, Long> getRepository() {
        return movieRepository;
    }
}
