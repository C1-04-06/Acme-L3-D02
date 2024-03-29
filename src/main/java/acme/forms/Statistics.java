
package acme.forms;

import acme.framework.data.AbstractObject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Statistics extends AbstractObject {

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
