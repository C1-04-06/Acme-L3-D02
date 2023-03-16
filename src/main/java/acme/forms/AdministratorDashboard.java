
package acme.forms;

import java.util.Map;

import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdministratorDashboard extends AbstractForm {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	Map<String, Integer>		numberOfPrincipalsByRole;

	Double						ratioOfPeepsWithEmailAndLink;

	Map<Boolean, Double>		ratioOfBulletinByCritical;

	Map<String, Statistics>		budgetByCurrencyStats;

	Statistics					notesStats;
	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
