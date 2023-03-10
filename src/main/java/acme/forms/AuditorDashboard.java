
package acme.forms;

import java.util.Map;

import acme.entities.nature.Nature;
import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuditorDashboard extends AbstractForm {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes ------------------------------------------------------------

	Map<Nature, Integer>		numberOfAuditsPerNature;

	Statistics					auditingRecordsStats;

	Statistics					lengthStats;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------
}