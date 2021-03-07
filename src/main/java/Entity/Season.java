package Entity;

import java.util.List;
import java.util.Random;

public class Season {
	// Const for season name
	public static String winter = "winter";
	public static String spring = "spring";
	public static String summer = "summer";
	public static String autumn = "autumn";

	// Class attributes
	private final String name;
	private final List<Event> seasonEvents;
	private Event selectedEvent;

	// Class constructor
	public Season(String name, List<Event> seasonEvents) {
		this.name = name;
		this.seasonEvents = seasonEvents;
	}

	//Getters
	public String getName() {
		return name;
	}

	public List<Event> getSeasonEvents() {
		return seasonEvents;
	}

	public Event getSelectedEvent() {
		return selectedEvent;
	}

	//Class methods
	public void randomlySelectSeasonEvent() {
		int numberOfElement = this.seasonEvents.size() + 1;
		Random selector = new Random();
		int selectedIndex = selector.nextInt(numberOfElement);
		this.selectedEvent = this.seasonEvents.get(selectedIndex);
	}

}
