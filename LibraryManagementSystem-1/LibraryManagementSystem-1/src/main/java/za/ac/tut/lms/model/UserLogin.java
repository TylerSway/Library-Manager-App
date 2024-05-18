package za.ac.tut.lms.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserLogin {

	@NotNull(message="Student number is required")
	@Size(min=3,max=9,message="Student number  has to be 9 digits")
	private String st_number;
	
	@NotNull(message="Password required")
	@Size(min=8,max=15,message="Password must be between 8 and 15 characters")
	private String passwd;
	
	public UserLogin() {
		super();
	}
	public UserLogin(String st_number, String passwd) {
		super();
		this.st_number = st_number;
		this.passwd = passwd;
	}
	public String getSt_number() {
		return st_number;
	}
	public void setSt_number(String st_number) {
		this.st_number = st_number;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	@Override
	public String toString() {
		return "UserLogin [st_number=" + st_number + ", passwd=" + passwd + "]";
	}
	
	
}
