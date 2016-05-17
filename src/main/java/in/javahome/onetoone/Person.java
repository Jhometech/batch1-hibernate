package in.javahome.onetoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Person implements Serializable{
		@Id
		private Integer pId;
		@Column
		private String name;
		@Column
		private String location;
		
		@OneToOne
		@JoinColumn(name="PASSPORT_ID")
		private Passport passport;
		
		
		
		public Passport getPassport() {
			return passport;
		}
		public void setPassport(Passport passport) {
			this.passport = passport;
		}
		public Integer getpId() {
			return pId;
		}
		public void setpId(Integer pId) {
			this.pId = pId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		
		
}
