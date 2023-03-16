
package acme.entities.configuration;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SystemConfiguration extends AbstractEntity {

	protected static final long	serialVersionUID	= 1L;

	@NotBlank
	@Pattern(regexp = "^[A-Z]{3}$")
	protected String			systemCurrency;

	@NotBlank
	@Pattern(regexp = "^[A-Z]{3}(,[A-Z]{3}){0,2}$")
	protected String			acceptedCurrencies;

}
