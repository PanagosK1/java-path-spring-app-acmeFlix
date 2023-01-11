package gr.codelearn.spring.app.domain;

import gr.codelearn.spring.app.domain.enumeration.Subscription;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Account extends BaseModel {
    @NotNull
    @Column(length = 50, nullable = false)
    private String firstName;
    @NotNull
    @Column(length = 50, nullable = false)
    private String lastName;
    @NotNull
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

    @OneToMany
    private List<Profile> profiles;

}
