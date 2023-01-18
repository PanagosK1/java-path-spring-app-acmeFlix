package gr.codelearn.spring.app.service;

import gr.codelearn.spring.app.domain.View;
import gr.codelearn.spring.app.repository.ViewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ViewServiceImpl extends BaseServiceImpl<View> implements ViewService{

    private final ViewRepository viewRepository;

    @Override
    JpaRepository<View, Long> getRepository() {
        return viewRepository;
    }
}
