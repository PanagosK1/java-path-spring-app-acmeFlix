package gr.codelearn.spring.app.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Date;

@Data
@SuperBuilder
@Entity
@NoArgsConstructor
public class Backup extends BaseModel{

    @Column(nullable = false)
    private String path;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date date;
}
