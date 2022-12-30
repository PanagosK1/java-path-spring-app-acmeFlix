package gr.codelearn.spring.app.domain;

import gr.codelearn.spring.app.domain.enumeration.Subscription;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.hibernate.mapping.Set;


public class Account extends BaseModel {
//test comment
    private String firstName;
    private String lastName;
    private String passWord;
    private String email;
    private Subscription subscription;
    private int Age;

    //private Set<Profiles> profiles;;

    public Account() {
    }
}
