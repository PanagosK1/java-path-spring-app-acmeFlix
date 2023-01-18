package gr.codelearn.spring.app.service;

import gr.codelearn.spring.app.domain.Backup;
import gr.codelearn.spring.app.repository.BackUpRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BackupServiceImpl extends BaseServiceImpl<Backup> implements BackupService{
    private final BackUpRepository backupRepository;

    @Override
    JpaRepository<Backup, Long> getRepository() {
        return backupRepository;
    }
}
