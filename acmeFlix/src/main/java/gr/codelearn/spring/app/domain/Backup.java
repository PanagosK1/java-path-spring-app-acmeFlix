package gr.codelearn.spring.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


import java.util.Date;

@Data
@SuperBuilder
@Entity
@NoArgsConstructor
public class Backup extends BaseModel {

    @Column(nullable = false)
    private String path;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date date;
}
