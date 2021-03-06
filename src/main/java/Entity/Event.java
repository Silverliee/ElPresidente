package Entity;

import java.util.List;

public class Event {
	// Class attributes
	private final String name;
	private final String description;
	private final List<Choice> choiceOptions;

	// Class constructor
	public Event(String name, String description, List<Choice> choiceOptions) {
		this.name = name;
		this.description = description;
		this.choiceOptions = choiceOptions;
	}

	//Getters
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public List<Choice> getChoiceOptions() {
		return choiceOptions;
	}
}
