package movies;

import java.util.ArrayList;
import java.util.List;

public class MovieManager {

	public static void main(String[] args) {
		Person zalan = new Person("Kiraly", "Zalan", Gender.MALE, true, true);
		List<Person> personsList = new ArrayList<Person>();
		personsList.add(zalan);
		Movie bloff = new Movie("Bloff", Genre.COMEDY, 120, 8.9, personsList);

	}

}
