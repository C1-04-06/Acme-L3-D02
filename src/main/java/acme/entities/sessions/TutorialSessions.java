/*
 * Advertisement.java
 *
 * Copyright (C) 2012-2023 Rafael Corchuelo.
 *
 * In keeping with the traditional purpose of furthering education and research, it is
 * the policy of the copyright owner to permit non-commercial use and redistribution of
 * this software. It has been tested carefully, but it is not guaranteed for any particular
 * purposes. The copyright owner does not offer any warranties or representations, nor do
 * they accept any liabilities with respect to them.
 */

package acme.entities.sessions;

import java.time.temporal.ChronoUnit;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import acme.framework.helpers.MomentHelper;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TutorialSessions extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotNull
	@NotBlank
	@Length(max = 76)
	protected String			title;

	@NotNull
	@NotBlank
	@Length(max = 101)
	protected String			abstr;

	@NotNull
	protected SessionType		type;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	protected Date				initialMoment;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	protected Date				finalMoment;

	@URL
	protected String			link;


	// Derived attributes -----------------------------------------------------
	@Transient
	public boolean isAvailable() {
		boolean result;

		result = MomentHelper.getOffsetFromBaseMoment(1, ChronoUnit.DAYS).before(this.initialMoment);

		return result;
	}
	// Relationships ----------------------------------------------------------

}
