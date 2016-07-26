import java.util.ArrayList;

public class Database {
	private ArrayList<Profile> profiles;

	/**
	 * Constructor utilizing the ArrayList.
	 */
	public Database() {
		profiles = new ArrayList<Profile>();
	}

	/**
	 * Adds new profiles to the ArrayList.
	 * 
	 * @param profile
	 *            is the new detailed profile added.
	 */
	public void addProfile(Profile profile) {
		if (profile != null) {
			profiles.add(profile);
		}

	}

	/**
	 * Displays all the profiles in the ArrayList, both students and
	 * instructors.
	 */
	public void displayDetails() {
		if (!profiles.isEmpty() && profiles != null) {
			System.out.println("These are everyone in the database ---");
			for (Profile profile : profiles) {
				profile.displayDetails();
			}
		}
	}
}
