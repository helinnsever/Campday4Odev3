
public class Gamer {

	private String FirstName;
	private String LastName;
	private String birthday;
	private String tcno;
	
	public Gamer(String FirstName, String LastName, String birthday, String tcno) {
		super();
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.tcno=tcno;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getTcno() {
		return tcno;
	}
	public void setTcno(String tcno) {
		this.tcno = tcno;
	}
}
