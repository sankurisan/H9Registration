
public class Member {
    private String firstName;
    private String lastName;
    private String technology;
    public Member(String firstName, String lastName, String technology, int mastersCompletionYear, String email,
			String contactNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.technology = technology;
		this.mastersCompletionYear = mastersCompletionYear;
		this.email = email;
		this.contactNumber = contactNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public int getMastersCompletionYear() {
		return mastersCompletionYear;
	}
	public void setMastersCompletionYear(int mastersCompletionYear) {
		this.mastersCompletionYear = mastersCompletionYear;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	private int mastersCompletionYear;
    private String email;
    private String contactNumber;
}
