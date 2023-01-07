package gr.codelearn.spring.app.domain;

import gr.codelearn.spring.app.domain.enumeration.Subscription;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
public class Account extends BaseModel {
    @Column(length = 50, nullable = false)
    private String firstName;
    @Column(length = 50, nullable = false)
    private String lastName;
    @Column(length = 50, nullable = false)
    private String passWord;
    @NotNull(message = "Account's email cannot be null")
    @Column(length = 50, nullable = false, unique = true)
    private String email;


    @Enumerated(EnumType.STRING)
    @Column(length = 10, nullable = false)
    private Subscription subscription;

    @Column(name = "AGE",length = 50, nullable = false)
    private int Age;

    @OneToMany(mappedBy = "account")
    @JoinColumn(nullable = false)
    private List<Profile> profiles;

    public Account() {
    }
}
