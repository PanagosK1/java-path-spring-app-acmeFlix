package gr.codelearn.spring.app.domain;



import javax.persistence.*;

import gr.codelearn.spring.app.domain.enumeration.Subscription;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

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

    @OneToMany(mappedBy = "account")
    private List<Profile> profiles;

    @Override
    public String toString(){
        StringBuilder dataBuilder = new StringBuilder();
        appendFieldValue(dataBuilder, getId().toString());
        appendFieldValue(dataBuilder, getFirstName());
        appendFieldValue(dataBuilder, getLastName());
        appendFieldValue(dataBuilder, getPassWord());
        appendFieldValue(dataBuilder, getEmail());
        appendFieldValue(dataBuilder, getSubscription().toString());
        appendFieldValue(dataBuilder, String.valueOf(getAge()));


        return dataBuilder.toString();
    }
}
