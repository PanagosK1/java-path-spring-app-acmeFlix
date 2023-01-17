package gr.codelearn.spring.app.controller;

import gr.codelearn.spring.app.domain.Account;
import gr.codelearn.spring.app.domain.Episode;
import gr.codelearn.spring.app.domain.Movie;
import gr.codelearn.spring.app.domain.Serie;
import gr.codelearn.spring.app.mapper.BaseMapper;
import gr.codelearn.spring.app.mapper.EpisodeMapper;
import gr.codelearn.spring.app.mapper.SerieMapper;
import gr.codelearn.spring.app.service.AccountService;
import gr.codelearn.spring.app.service.BaseService;
import gr.codelearn.spring.app.service.EpisodeService;
import gr.codelearn.spring.app.service.SerieService;
import gr.codelearn.spring.app.transfer.ApiResponse;
import gr.codelearn.spring.app.transfer.resource.AccountResource;
import gr.codelearn.spring.app.transfer.resource.EpisodeResource;
import gr.codelearn.spring.app.transfer.resource.MovieResource;
import gr.codelearn.spring.app.transfer.resource.SerieResource;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("series")
public class SerieController extends BaseController<Serie, SerieResource>{

    private final SerieService serieService;
    private final EpisodeService episodeService;
    private final SerieMapper serieMapper;

    private final EpisodeMapper episodeMapper;

    @Override
    BaseService<Serie, Long> getBaseService() {
        return serieService;
    }

    @Override
    BaseMapper<Serie, SerieResource> getBaseMapper() {
        return serieMapper;
    }

    @GetMapping(params = {"title"}, path = "findByTitle")
    public ResponseEntity<ApiResponse<SerieResource>> findByTitle(@RequestParam("title") String title, WebRequest request){
        logger.info("Series controller, findByTitle method");

        try{
            Serie result = serieService.findByTitle(title);
            if(result != null){
                return ResponseEntity.ok(ApiResponse.<SerieResource>builder().data(getBaseMapper().toResource(result)).build());
            }else{
                return ResponseEntity.notFound().build();
            }

        }catch (Exception exception){
            return (ResponseEntity<ApiResponse<SerieResource>>) exceptionHandler.handleException(exception, request);
        }
    }

    @GetMapping(params = {"episodeTitle"}, path = "findEpisodeByTitle/{serieTitle}")
    public ResponseEntity<ApiResponse<EpisodeResource>> findEpisodeByTitle(@PathVariable ("serieTitle") String serieTitle, @RequestParam("episodeTitle") String episodeTitle, WebRequest request){
        logger.info("Series controller, findEpisodeByTitle method");

        try{
            Episode result = episodeService.findEpisodeByTitle(serieTitle, episodeTitle);
            if(result != null){
                return ResponseEntity.ok(ApiResponse.<EpisodeResource>builder().data(episodeMapper.toResource(result)).build());
            }else{
                return ResponseEntity.notFound().build();
            }

        }catch (Exception exception){
            return (ResponseEntity<ApiResponse<EpisodeResource>>) exceptionHandler.handleException(exception, request);
        }
    }

    @GetMapping(path = "topTenViewedSeries")
    public ResponseEntity<ApiResponse<List<String>>> topTenViewedSeries(WebRequest request){
        //logger.info("Reports controller, topTenViewedContent method");


        try{
            List<String> result = serieService.findTop10ViewedSeries();

            if(result != null){
                return ResponseEntity.ok(ApiResponse.<List<String>>builder().data(result).build());
            }else{
                return ResponseEntity.notFound().build();
            }

        }catch (Exception exception){
            return null;
        }
    }

    @GetMapping(path = "topTenRatedSeries")
    public ResponseEntity<ApiResponse<List<String>>> topTenRatedSeries(WebRequest request){
        //logger.info("Reports controller, topTenViewedContent method");


        try{
            List<String> result = serieService.findTop10RatedSeries();

            if(result != null){
                return ResponseEntity.ok(ApiResponse.<List<String>>builder().data(result).build());
            }else{
                return ResponseEntity.notFound().build();
            }

        }catch (Exception exception){
            return null;
        }
    }
}
