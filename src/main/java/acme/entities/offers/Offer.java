
package acme.entities.offers;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.components.datatypes.Money;
import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Offer extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	@Past
	protected Date				instantationMoment;

	@NotBlank
	@Length(max = 75)
	protected String			heading;

	@NotNull
	@NotBlank
	@Length(max = 100)
	protected String			summary;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	protected Date				startPeriod;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	protected Date				endPeriod;

	@NotNull
	protected Money				price;

	@URL
	protected String			link;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
