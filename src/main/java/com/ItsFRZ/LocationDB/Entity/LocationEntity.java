package com.ItsFRZ.LocationDB.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "crudtable")
public class LocationEntity {

	@Id
	private int lid;
	
	@Column(name = "lname")
	private String lname;
	
	private String lregion;
	
	private String lpincode;
	
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLregion() {
		return lregion;
	}
	public void setLregion(String lregion) {
		this.lregion = lregion;
	}
	public String getLpincode() {
		return lpincode;
	}
	public void setLpincode(String lpincode) {
		this.lpincode = lpincode;
	}
	
	@Override
	public String toString() {
		return "LocationEntity [lid=" + lid + ", lname=" + lname + ", lregion=" + lregion + ", lpincode=" + lpincode
				+ "]";
	}
	
	
	
	
}
