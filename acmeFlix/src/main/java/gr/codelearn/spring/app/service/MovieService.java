package gr.codelearn.spring.app.service;

import gr.codelearn.spring.app.domain.Account;
import gr.codelearn.spring.app.domain.Movie;
import gr.codelearn.spring.app.transfer.resource.ReportTop10;
import org.springframework.data.util.Pair;

import java.util.List;

public interface MovieService extends BaseService<Movie, Long>{
    Movie findByTitle(String title);
    List<String> findTop10ViewedMovies();
    List<String> findTop10RatedMovies();
}
