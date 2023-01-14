package gr.codelearn.spring.app.service;

import gr.codelearn.spring.app.domain.Account;
import gr.codelearn.spring.app.domain.Movie;

import java.util.List;

public interface MovieService extends BaseService<Movie, Long>{
    Movie findByTitle(String title);
    List<Movie> findAllLazy();
}
