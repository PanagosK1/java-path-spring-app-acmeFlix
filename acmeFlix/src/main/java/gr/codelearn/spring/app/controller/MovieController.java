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
import gr.codelearn.spring.app.transfer.resource.SerieResource;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("movies")
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

    @GetMapping(params = {"title"}, path = "findByTitle")
    public ResponseEntity<ApiResponse<MovieResource>> findByTitle(@RequestParam("title") String title, WebRequest request){
        logger.info("Movies controller, findByTitle method");


        try{
            Movie result = movieService.findByTitle(title);
            if(result != null){
                return ResponseEntity.ok(ApiResponse.<MovieResource>builder().data(getBaseMapper().toResource(result)).build());
            }else{
                return ResponseEntity.notFound().build();
            }

        }catch (Exception exception){
            return (ResponseEntity<ApiResponse<MovieResource>>) exceptionHandler.handleException(exception, request);
        }
    }

    @GetMapping(path = "topTenViewed")
    public ResponseEntity<ApiResponse<List<String>>> topTenViewed(WebRequest request){
        logger.info("Movies controller, topTenViewed method");


        try{
            List<String> result = movieService.findTop10ViewedMovies();

            if(result != null){
                return ResponseEntity.ok(ApiResponse.<List<String>>builder().data(result).build());
            }else{
                return ResponseEntity.notFound().build();
            }

        }catch (Exception exception){
            return (ResponseEntity<ApiResponse<List<String>>>) exceptionHandler.handleException(exception, request);
        }
    }

    @GetMapping(path = "topTenRated")
    public ResponseEntity<ApiResponse<List<String>>> topTenRated(WebRequest request){
        logger.info("Movies controller, topTenRated method");


        try{
            List<String> result = movieService.findTop10RatedMovies();

            if(result != null){
                return ResponseEntity.ok(ApiResponse.<List<String>>builder().data(result).build());
            }else{
                return ResponseEntity.notFound().build();
            }

        }catch (Exception exception){
            return (ResponseEntity<ApiResponse<List<String>>>) exceptionHandler.handleException(exception, request);
        }
    }
}
