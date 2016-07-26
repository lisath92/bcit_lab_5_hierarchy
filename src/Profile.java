/**
 * 
 */

/**
 * @author Lisa Hsu
 *
 */
public class Profile {

	private String firstName;
	private String lastName;
	private String email;
	private String bcitId;

	/**
	 * Default constructor.
	 */
	public Profile() {
	}

	/**
	 * Constructor that details a complete profile.
	 * 
	 * @param firstName
	 *            is the first name of the person profile.
	 * @param lastName
	 *            is the last name of the person profile.
	 * @param email
	 *            is the email of the person.
	 * @param bcitId
	 *            is the college ID of the person.
	 */
	public Profile(String firstName, String lastName, String email, String bcitId) {
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setBcitId(bcitId);
	}

	/**
	 * @return the firstName as a String.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set.
	 */
	public void setFirstName(String firstName) {
		if (firstName != null && firstName.length() > 0) {
			this.firstName = firstName;
		}
	}

	/**
	 * @return the lastName as a String.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set.
	 */
	public void setLastName(String lastName) {
		if (lastName != null && lastName.length() > 0) {
			this.lastName = lastName;
		}
	}

	/**
	 * @return the email as a String.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set.
	 */
	public void setEmail(String email) {
		if (email != null && email.length() > 0) {
			this.email = email;
		}
	}

	/**
	 * @return the bcitId as a String.
	 */
	public String getBcitId() {
		return bcitId;
	}

	/**
	 * @param bcitId
	 *            the bcitId to set.
	 */
	public void setBcitId(String bcitId) {
		if (bcitId != null && bcitId.length() > 0) {
			this.bcitId = bcitId;
		}
	}
	
	public void displayDetails() {
			System.out.println("Name: " + getFirstName() + " " + getLastName());
			System.out.println("Email: " + getEmail());
		
	}

}
