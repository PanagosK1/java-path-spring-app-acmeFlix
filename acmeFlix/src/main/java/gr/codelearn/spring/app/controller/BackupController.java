package gr.codelearn.spring.app.controller;

import gr.codelearn.spring.app.domain.Backup;
import gr.codelearn.spring.app.mapper.BackupMapper;
import gr.codelearn.spring.app.mapper.BaseMapper;
import gr.codelearn.spring.app.service.BackupService;
import gr.codelearn.spring.app.service.BaseService;
import gr.codelearn.spring.app.transfer.resource.BackupResource;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("backups")
public class BackupController extends BaseController<Backup, BackupResource>{

    private BackupService backupService;

    private BackupMapper backupMapper;

    @Override
    BaseService<Backup, Long> getBaseService() {
        return backupService;
    }

    @Override
    BaseMapper<Backup, BackupResource> getBaseMapper() {
        return backupMapper;
    }
}
