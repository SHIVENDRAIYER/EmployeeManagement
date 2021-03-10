package labBook1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Author {
	
	@GeneratedValue
	@Id
	int authorId;
	
	String firstName;
	String middleName;
	String lastName;
	long phoneNo;
	
	public Author(String firstName, String middleName, String lastName, long phoneNo) {
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}

	public int getAuthorId() {
		
		return authorId;
	}

	public void setAuthorId(int authorId) {
		
		this.authorId = authorId;
	}

	public String getFirstName() {
		
		return firstName;
	}

	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
	}

	public String getMiddleName() {
		
		return middleName;
	}

	public void setMiddleName(String middleName) {
		
		this.middleName = middleName;
	}

	public String getLastName() {
		
		return lastName;
	}

	public void setLastName(String lastName) {
		
		this.lastName = lastName;
	}

	public long getPhoneNo() {
		
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		
		return "Author [authorId=" + authorId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", phoneNo=" + phoneNo + "]";
	}
}