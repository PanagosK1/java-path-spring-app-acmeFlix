package gr.codelearn.spring.app.service;

import gr.codelearn.spring.app.domain.Profile;
import gr.codelearn.spring.app.domain.Rating;
import gr.codelearn.spring.app.repository.ProfileRepository;
import gr.codelearn.spring.app.repository.RatingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RatingServiceImpl extends BaseServiceImpl<Rating> implements RatingService{
    private final RatingRepository ratingRepository;


    @Override
    JpaRepository<Rating, Long> getRepository() {
        return ratingRepository;
    }
}
