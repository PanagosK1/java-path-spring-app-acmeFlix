package gr.codelearn.spring.app.service;

import gr.codelearn.spring.app.domain.Actor;
import gr.codelearn.spring.app.repository.ActorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActorServiceImpl extends  BaseServiceImpl<Actor> implements ActorService {

    private final ActorRepository actorRepository;

    @Override
    JpaRepository<Actor, Long> getRepository() {
        return actorRepository;
    }
}