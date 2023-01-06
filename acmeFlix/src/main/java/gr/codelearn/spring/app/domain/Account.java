package gr.codelearn.spring.app.domain;

import gr.codelearn.spring.app.domain.enumeration.Subscription;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.hibernate.mapping.Set;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "ACCOUNTS", indexes = {@Index(columnList = "email")})
@SequenceGenerator(name = "idGenerator", sequenceName = "CUSTOMERS_SEQ", initialValue = 1, allocationSize = 1)
public class Account extends BaseModel {
    @NotNull(message = "Customer's FirstName cannot be null")
    @Column(length = 50, nullable = false, unique = false)
    private String firstName;
    @NotNull(message = "Customer's LastName cannot be null")
    @Column(length = 50, nullable = false, unique = false)
    private String lastName;
    @NotNull(message = "Customer's Password cannot be null")
    @Column(length = 50, nullable = false, unique = false)
    private String passWord;
    @NotNull(message = "Customer's FirstName cannot be null")
    @Column(length = 50, nullable = false, unique = true)
    private String email;

    @NotNull(message = "Subscription cannot be null")
    @Enumerated(EnumType.STRING)
    @Column(length = 10, nullable = false)
    private Subscription subscription;
    @NotNull(message = "Customer's FirstName cannot be null")
    @Column(name = "AGE",length = 50, nullable = false, unique = true)
    @Min(18)
    @Max(100)
    private int Age;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private List<Profiles> profiles;

    public Account() {
    }
}
