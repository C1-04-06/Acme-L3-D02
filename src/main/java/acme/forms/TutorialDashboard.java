
package acme.forms;

import java.util.Map;

import acme.entities.natures.Nature;
import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TutorialDashboard extends AbstractForm {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	Map<Nature, Integer>		numberOfTutorialPerNature;

	Statistics					tutorialStats;

	Statistics					sessionStats;
	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
