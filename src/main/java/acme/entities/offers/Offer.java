
package acme.entities.offers;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

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
	@PastOrPresent
	protected Date				instantationMoment;

	@NotBlank
	@Length(max = 75)
	protected String			heading;

	@NotNull
	@NotBlank
	@Length(max = 100)
	protected String			summary;

	//El periodo debe iniciar al menos un día después de la creación de la oferta y debe durar al menos una semana. Implementar como validación custom.
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	protected Date				startPeriod;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	protected Date				endPeriod;

	@NotNull
	protected Money				price;

	@URL
	@Length(max = 255)
	protected String			link;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
