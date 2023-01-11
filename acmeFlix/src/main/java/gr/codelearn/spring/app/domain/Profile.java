package gr.codelearn.spring.app.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
@SuperBuilder
public class Profile extends BaseModel{

    @Column(nullable = false)
    private String username;

    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;

}
