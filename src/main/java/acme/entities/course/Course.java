
package acme.entities.course;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.entities.lecture.LectureType;
import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Course extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------
	@NotNull
	@NotBlank
	@Pattern(regexp = "[A-Z]{1,3} [0-9]{3}")
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
	protected LectureType		type;

	@NotNull
	@PositiveOrZero
	protected Integer			price;

	@URL
	protected String			link;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
