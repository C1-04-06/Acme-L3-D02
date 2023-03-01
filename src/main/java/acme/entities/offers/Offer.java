
package acme.entities.offers;

import java.time.temporal.ChronoUnit;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.PositiveOrZero;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.components.datatypes.Money;
import acme.framework.data.AbstractEntity;
import acme.framework.helpers.MomentHelper;
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

	@NotNull
	@NotBlank
	@Length(max = 76)
	protected String			heading;

	@NotNull
	@NotBlank
	@Length(max = 101)
	protected String			summary;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	protected Date				initialMoment;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	protected Date				finalMoment;

	@NotNull
	@PositiveOrZero
	protected Money				price;

	@URL
	protected String			link;


	// Derived attributes -----------------------------------------------------
	@Transient
	public boolean isAvailable() {
		boolean result;

		result = MomentHelper.getOffsetFromBaseMoment(1, ChronoUnit.DAYS).before(this.initialMoment);

		return result;
	}
	// Relationships ----------------------------------------------------------

}
