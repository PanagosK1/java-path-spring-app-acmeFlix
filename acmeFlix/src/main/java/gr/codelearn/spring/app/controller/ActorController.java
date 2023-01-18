package gr.codelearn.spring.app.controller;

import gr.codelearn.spring.app.domain.Actor;
import gr.codelearn.spring.app.mapper.ActorMapper;
import gr.codelearn.spring.app.mapper.BaseMapper;
import gr.codelearn.spring.app.service.ActorService;
import gr.codelearn.spring.app.service.BaseService;
import gr.codelearn.spring.app.transfer.resource.ActorResource;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("actors")
public class ActorController extends BaseController<Actor, ActorResource>{

    private ActorService actorService;

    private ActorMapper actorMapper;

    @Override
    BaseService<Actor, Long> getBaseService() {
        return actorService;
    }

    @Override
    BaseMapper<Actor, ActorResource> getBaseMapper() {
        return actorMapper;
    }
}
