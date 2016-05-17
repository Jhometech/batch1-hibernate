package in.javahome.onetoone;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PASSPORT")
public class Passport implements Serializable {
	@Id
	@Column(name="PASSPORT_ID")
	private String passportNo;
	
	@Column(name="DATE_OF_EXPIRY")
	private Date doe;
	@Column(name="POI")
	private String placeOfIssue;
	
	@OneToOne(mappedBy = "passport")
	private Person person;
	
	
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public Date getDoe() {
		return doe;
	}

	public void setDoe(Date doe) {
		this.doe = doe;
	}

	public String getPlaceOfIssue() {
		return placeOfIssue;
	}

	public void setPlaceOfIssue(String placeOfIssue) {
		this.placeOfIssue = placeOfIssue;
	}

}
