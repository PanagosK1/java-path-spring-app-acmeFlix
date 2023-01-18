package gr.codelearn.spring.app.transfer.resource;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class BaseResource implements Serializable {
	protected Long id;
}
