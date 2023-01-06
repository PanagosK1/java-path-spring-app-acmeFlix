package gr.codelearn.spring.app.domain;

import gr.codelearn.spring.app.domain.enumeration.Genre;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.ArrayList;
@NoArgsConstructor
@Entity
public class Profiles extends BaseModel{
    private String username;

    private Account account;
}
