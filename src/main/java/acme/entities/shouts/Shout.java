package acme.entities.shouts;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.URL;

import acme.entities.dudes.Dude;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Shout extends DomainEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@Temporal(TemporalType.DATE)
	@Past
	@NotNull
	protected Date				moment;

	@NotBlank
	protected String			author;

	@NotBlank
	protected String			text;
	
	@URL
	protected String			info;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------
	@Lob
	protected Dude dude;
}
