
package acme.entities.practicum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Practicum extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@Pattern(regexp = "[A-Z]{1,3}\\d{3}")
	@Column(unique = true)
	protected String			code;

	@NotBlank
	@Length(max = 75)
	protected String			title;

	@NotBlank
	@Length(max = 100)
	protected String			abstr;

	@NotBlank
	@Length(max = 100)
	protected String			goals;

	// Derived attributes -----------------------------------------------------


	//To Do: Relacion para calcular el tiempo total
	@Transient
	public Integer totalTime() {
		final int result = 0;

		return result;
	}

	// Relationships ----------------------------------------------------------
}
