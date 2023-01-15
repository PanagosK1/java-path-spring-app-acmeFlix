package gr.codelearn.spring.app.transfer.resource;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
public class BaseResource implements Serializable {
	protected Long id;
}
