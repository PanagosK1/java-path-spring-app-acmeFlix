package gr.codelearn.spring.app.controller;

import gr.codelearn.spring.app.domain.View;
import gr.codelearn.spring.app.mapper.BaseMapper;
import gr.codelearn.spring.app.mapper.RatingMapper;
import gr.codelearn.spring.app.mapper.ViewMapper;
import gr.codelearn.spring.app.service.BaseService;
import gr.codelearn.spring.app.service.RatingService;
import gr.codelearn.spring.app.service.ViewService;
import gr.codelearn.spring.app.transfer.resource.ViewResource;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("views")
public class ViewController extends BaseController<View, ViewResource>{

    private final ViewService viewService;
    private final ViewMapper viewMapper;

    @Override
    BaseService<View, Long> getBaseService() {
        return viewService;
    }

    @Override
    BaseMapper<View, ViewResource> getBaseMapper() {
        return viewMapper;
    }
}
