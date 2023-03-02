
package acme.entities.practicum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import acme.entities.sessions.PracticumSession;
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
	@NotNull
	@NotBlank
	@Pattern(regexp = "[A-Z]{1,3}[0-9][0-9]{3}")
	@Column(unique = true)
	protected String			code;

	@NotNull
	@NotBlank
	@Length(max = 76)
	protected String			title;

	@NotNull
	@NotBlank
	@Length(max = 101)
	protected String			abstr;

	@NotNull
	@NotBlank
	@Length(max = 101)
	protected String			goals;

	// Derived attributes -----------------------------------------------------


	//To Do: Relacion para calcular el tiempo total
	@Transient
	public Integer totalTime() {
		final int result = 0;

		return result;
	}


	// Relationships ----------------------------------------------------------
	@NotNull
	@Valid
	@ManyToOne(optional = false)
	protected PracticumSession practicumSession;
}
