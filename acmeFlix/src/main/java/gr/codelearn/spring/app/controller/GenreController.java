package gr.codelearn.spring.app.controller;

import gr.codelearn.spring.app.domain.Genre;
import gr.codelearn.spring.app.domain.Movie;
import gr.codelearn.spring.app.mapper.BaseMapper;
import gr.codelearn.spring.app.mapper.GenreMapper;
import gr.codelearn.spring.app.mapper.MovieMapper;
import gr.codelearn.spring.app.service.BaseService;
import gr.codelearn.spring.app.service.GenreService;
import gr.codelearn.spring.app.service.MovieService;
import gr.codelearn.spring.app.transfer.ApiResponse;
import gr.codelearn.spring.app.transfer.resource.EpisodeResource;
import gr.codelearn.spring.app.transfer.resource.GenreResource;
import gr.codelearn.spring.app.transfer.resource.MovieResource;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("genres")
public class GenreController extends BaseController<Genre, GenreResource>{

    private final GenreService genreService;
    private final GenreMapper genreMapper;


    @Override
    BaseService<Genre, Long> getBaseService() {
        return genreService;
    }

    @Override
    BaseMapper<Genre, GenreResource> getBaseMapper() {
        return genreMapper;
    }

    @GetMapping(path = "topFivePopularMovieGenres")
    public ResponseEntity<ApiResponse<List<String>>> topFivePopularMovieGenres(WebRequest request){
        logger.info("Genres controller, topFivePopularMovieGenres method");


        try{
            List<String> result = genreService.findTop5PopularMovieGenres();

            if(result != null){
                return ResponseEntity.ok(ApiResponse.<List<String>>builder().data(result).build());
            }else{
                return ResponseEntity.notFound().build();
            }

        }catch (Exception exception){
            return (ResponseEntity<ApiResponse<List<String>>>) exceptionHandler.handleException(exception, request);
        }
    }

    @GetMapping(path = "topFivePopularSerieGenres")
    public ResponseEntity<ApiResponse<List<String>>> topFivePopularSerieGenres(WebRequest request){
        logger.info("Reports controller, topFivePopularSerieGenres method");


        try{
            List<String> result = genreService.findTop5PopularSerieGenres();

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
