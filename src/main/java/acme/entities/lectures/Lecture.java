
package acme.entities.lectures;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.entities.natures.Nature;
import acme.framework.data.AbstractEntity;
import acme.roles.Lecturer;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Lecture extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@Length(max = 75)
	protected String			title;

	@NotBlank
	@Length(max = 100)
	protected String			abstr;

	@Positive
	@Digits(integer = 3, fraction = 2)
	@DecimalMin(value = "0.01", inclusive = true)
	protected double			time;

	@NotNull
	protected Nature			lectureNature;

	@URL
	@Length(max = 255)
	protected String			link;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

	@NotNull
	@Valid
	@ManyToOne(optional = false)
	protected Lecturer			lecturer;

}
