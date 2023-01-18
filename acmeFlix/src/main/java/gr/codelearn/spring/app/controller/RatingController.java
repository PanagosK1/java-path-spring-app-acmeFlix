package gr.codelearn.spring.app.controller;

import gr.codelearn.spring.app.domain.Profile;
import gr.codelearn.spring.app.domain.Rating;
import gr.codelearn.spring.app.mapper.BaseMapper;
import gr.codelearn.spring.app.mapper.ProfileMapper;
import gr.codelearn.spring.app.mapper.RatingMapper;
import gr.codelearn.spring.app.service.BaseService;
import gr.codelearn.spring.app.service.ProfileService;
import gr.codelearn.spring.app.service.RatingService;
import gr.codelearn.spring.app.transfer.resource.ProfileResource;
import gr.codelearn.spring.app.transfer.resource.RatingResource;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("ratings")
public class RatingController extends BaseController<Rating, RatingResource>{

    private final RatingService ratingService;
    private final RatingMapper ratingMapper;

    @Override
    BaseService<Rating, Long> getBaseService() {
        return ratingService;
    }

    @Override
    BaseMapper<Rating, RatingResource> getBaseMapper() {
        return ratingMapper;
    }
}
