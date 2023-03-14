
package acme.entities.banners;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Banner extends AbstractEntity {
	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	@PastOrPresent
	protected Date				instantationMoment;

	//TODO: constraint restrictions: startPeriod and endPeriod form a period to be fulfilled the following restrictions: start at any moment after instanttationMoment and last one week at least.

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	protected Date				startPeriod;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	protected Date				endPeriod;

	@NotBlank
	@Length(max = 75)
	protected String			slogan;

	@NotBlank
	@URL
	protected String			picture;

	@NotBlank
	@URL
	protected String			target;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
