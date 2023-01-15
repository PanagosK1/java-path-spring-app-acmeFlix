package gr.codelearn.spring.app.controller;

import gr.codelearn.spring.app.domain.Account;
import gr.codelearn.spring.app.domain.Movie;
import gr.codelearn.spring.app.mapper.BaseMapper;
import gr.codelearn.spring.app.mapper.MovieMapper;
import gr.codelearn.spring.app.service.AccountService;
import gr.codelearn.spring.app.service.BaseService;
import gr.codelearn.spring.app.service.MovieService;
import gr.codelearn.spring.app.transfer.ApiResponse;
import gr.codelearn.spring.app.transfer.resource.AccountResource;
import gr.codelearn.spring.app.transfer.resource.MovieResource;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("movie")
public class MovieController extends BaseController<Movie, MovieResource>{

    private final MovieService movieService;
    private final MovieMapper movieMapper;
    @Override
    BaseService<Movie, Long> getBaseService() {
        return movieService;
    }

    @Override
    BaseMapper<Movie, MovieResource> getBaseMapper() {
        return movieMapper;
    }

    @GetMapping(params = {"title"})
    public ResponseEntity<ApiResponse<Movie>> findByTitle(@RequestParam("title") String title){
        return ResponseEntity.ok(ApiResponse.<Movie>builder().data(movieService.findByTitle(title)).build());
        //return movieService.findByTitle(title);
    }
}
