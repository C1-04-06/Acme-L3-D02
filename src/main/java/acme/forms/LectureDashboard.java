
package acme.forms;

import java.util.Map;

import acme.entities.natures.Nature;
import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LectureDashboard extends AbstractForm {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes ------------------------------------------------------------

	Map<Nature, Integer>		numberOfLecturesPerNature;

	Statistics					lecturesStats;

	Statistics					coursesStats;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------
}
