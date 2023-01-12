package gr.codelearn.spring.app.transfer.resource;


import gr.codelearn.spring.app.domain.enumeration.Subscription;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
public class AccountResource extends BaseResource {
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String passWord;
    @NotNull(message = "Account's email cannot be null")
    private String email;

    @NotNull
    private Subscription subscription;

    @NotNull
    private int Age;

    private List<ProfileResource> profiles;
}
