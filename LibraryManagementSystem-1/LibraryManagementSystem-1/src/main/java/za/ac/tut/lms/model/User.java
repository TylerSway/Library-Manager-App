package za.ac.tut.lms.model;

public class User {

	private String name;
	private String surname;
	private Integer st_number;
	private String passwd;
	
	
	public User() {
		super();
	}
	public User(String name, String surname, Integer st_number, String passwd) {
		super();
		this.name = name;
		this.surname = surname;
		this.st_number = st_number;
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Integer getSt_number() {
		return st_number;
	}
	public void setSt_number(Integer st_number) {
		this.st_number = st_number;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	
	
	
	
}
