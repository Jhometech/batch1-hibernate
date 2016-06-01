package in.javahome.inheritancemapping;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue(value="DD")
@Entity	
public class DDPayment extends Payment{
	private int ddNumber;

	public int getDdNumber() {
		return ddNumber;
	}

	public void setDdNumber(int ddNumber) {
		this.ddNumber = ddNumber;
	}
	
}
