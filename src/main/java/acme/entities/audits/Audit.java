
package acme.entities.audits;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import acme.datatypes.Mark;
import acme.entities.course.Course;
import acme.framework.data.AbstractEntity;
import acme.roles.Auditor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Audit extends AbstractEntity {
	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@Pattern(regexp = "[A-Z]{1,3}[0-9][0-9]{3}")
	@NotBlank
	@Column(unique = true)
	protected String			code;

	@NotBlank
	@Length(max = 101)
	protected String			conclusion;

	@NotBlank
	@Length(max = 101)
	protected String			strongPoints;

	@NotBlank
	@Length(max = 101)
	protected String			weakPoints;

	// Derived attributes -----------------------------------------------------

	protected Mark				mark;

	// Relationships ----------------------------------------------------------

	//@ManyToOne(optional = false)
	@NotNull
	protected Course			course;

	@ManyToOne(optional = false)
	@NotNull
	protected Auditor			auditor;

}
