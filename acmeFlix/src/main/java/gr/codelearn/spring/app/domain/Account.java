package gr.codelearn.spring.app.domain;

import gr.codelearn.spring.app.domain.enumeration.Subscription;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.ArrayList;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "ACCOUNTS")
@SequenceGenerator(name = "idGenerator", sequenceName = "ACCOUNT_SEQ", initialValue = 1, allocationSize = 1)
public class Account extends BaseModel {

    @NotNull(message = "Account firstname")
    @Column(length = 50, nullable = false, unique = true)
    private String firstName;
    private String lastName;
    private String passWord;
    private String email;
    private Subscription subscription;

    @Min(18)
    @Max(100)
    private int Age;

    private ArrayList<Profiles> profiles;

}
