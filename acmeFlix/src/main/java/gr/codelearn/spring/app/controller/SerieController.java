package gr.codelearn.spring.app.controller;

import gr.codelearn.spring.app.domain.Account;
import gr.codelearn.spring.app.domain.Serie;
import gr.codelearn.spring.app.mapper.BaseMapper;
import gr.codelearn.spring.app.mapper.SerieMapper;
import gr.codelearn.spring.app.service.AccountService;
import gr.codelearn.spring.app.service.BaseService;
import gr.codelearn.spring.app.service.SerieService;
import gr.codelearn.spring.app.transfer.resource.AccountResource;
import gr.codelearn.spring.app.transfer.resource.SerieResource;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("series")
public class SerieController extends BaseController<Serie, SerieResource>{

    private final SerieService serieService;
    private final SerieMapper serieMapper;

    @Override
    BaseService<Serie, Long> getBaseService() {
        return serieService;
    }

    @Override
    BaseMapper<Serie, SerieResource> getBaseMapper() {
        return serieMapper;
    }
}
