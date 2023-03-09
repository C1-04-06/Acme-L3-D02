
package acme.forms;

import javax.persistence.Entity;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Statistics extends AbstractEntity {

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
