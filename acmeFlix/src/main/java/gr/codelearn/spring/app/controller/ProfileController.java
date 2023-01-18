package gr.codelearn.spring.app.controller;

import gr.codelearn.spring.app.domain.Profile;
import gr.codelearn.spring.app.mapper.BaseMapper;
import gr.codelearn.spring.app.mapper.ProfileMapper;
import gr.codelearn.spring.app.service.BaseService;
import gr.codelearn.spring.app.service.ProfileService;
import gr.codelearn.spring.app.transfer.resource.ProfileResource;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("profiles")
public class ProfileController extends BaseController<Profile, ProfileResource> {

    private final ProfileService profileService;
    private final ProfileMapper profileMapper;

    @Override
    BaseService<Profile, Long> getBaseService() {
        return profileService;
    }

    @Override
    BaseMapper<Profile, ProfileResource> getBaseMapper() {
        return profileMapper;
    }
}
