
package acme.forms;

import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Statistics extends AbstractForm {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	protected int				count;

	protected Double			avg;

	protected Double			desv;

	protected Double			min;

	protected Double			max;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
