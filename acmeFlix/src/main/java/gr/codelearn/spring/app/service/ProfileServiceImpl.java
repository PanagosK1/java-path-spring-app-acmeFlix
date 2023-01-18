package gr.codelearn.spring.app.service;

import gr.codelearn.spring.app.domain.Profile;
import gr.codelearn.spring.app.repository.ProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl extends BaseServiceImpl<Profile> implements ProfileService{

    private final ProfileRepository profileRepository;

    @Override
    JpaRepository<Profile, Long> getRepository() {
        return profileRepository;
    }
}
