package Entity;

import java.util.Scanner;

import Exception.DevelopmentSectorsLimiteException;
import Exception.DevelopmentSectorNegativeValueException;

public class Game {
	// Class attributes
	private final Country country;
	private final String president;
	private final int difficulty;
	private Year currentYear;
	private Season currentSeason;

	// Class constructor
	public Game(Country country, String president, int difficulty) {
		this.country = country;
		this.president = president;
		this.difficulty = difficulty;
	}

	//Getters and setter
	public Country getCountry() {
		return country;
	}

	public String getPresident() {
		return president;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public Year getCurrentYear() {
		return currentYear;
	}

	public void setCurrentYear(Year currentYear) {
		this.currentYear = currentYear;
	}

	public void setCurrentSeason(Season currentSeason) {
		this.currentSeason = currentSeason;
	}

	//Class methods
	public void closureYear() {
		int goToNextYear = 0;
		Scanner keyboard = new Scanner(System.in);
		while (goToNextYear != 1) {
			System.out.println("Il est tant de cloturer l'année monsieur le president, voulez vous effectuer l'une des actions suivantes avant ? ");
			System.out.println("[1] Verser un pot de vin");
			System.out.println("[2] importer de la nourriture");
			System.out.println("[3] Ne rien faire");
			int decision = keyboard.nextInt();
			switch (decision) {
				case 1 -> {
					System.out.println("Veuiller choisir une faction");
					System.out.println("[1] Les capitalistes");
					System.out.println("[2] Les communistes");
					System.out.println("[3] Les libéraux");
					System.out.println("[4] Les religieux");
					System.out.println("[5] Les militaristes");
					System.out.println("[6] Les écologiste");
					System.out.println("[7] Les nationalistes");
					int faction = keyboard.nextInt();
					switch (faction) {
						case 1:
							this.country.getCapitalist().bride();
							break;
						case 2:
							this.country.getCommunist().bride();
							break;
						case 3:
							this.country.getLiberal().bride();
							break;
						case 4:
							this.country.getReligious().bride();
							break;
						case 5:
							this.country.getMilitarist().bride();
							break;
						case 6:
							this.country.getEcologist().bride();
							break;
						case 7:
							this.country.getNationalist().bride();
							break;
						default:
							break;
					}
				}
				case 2 -> {
					System.out.println("Combien d'unité de nourriture voulez vous importer ?");
					int amount = keyboard.nextInt();
					this.country.importFood(amount);
				}
				case 3 -> goToNextYear = 1;
				default -> System.out.println("je ne vous comprends pas");
			}
		}

	}

	public void takeSeasonDecision() throws DevelopmentSectorNegativeValueException, DevelopmentSectorsLimiteException {
		Event event = this.currentSeason.getSelectedEvent();
		System.out.println(event.getDescription());
		System.out.println("Que voulez-vous faire monsieur le president ?");
		for (Choice choice : event.getChoiceOptions()) {
			System.out.println(choice.getDescription());
		}
		Scanner keyboard = new Scanner(System.in);
		int decision = keyboard.nextInt();
		for (Choice choice : event.getChoiceOptions()) {
			if (decision == choice.getNumber()) {
				this.country.modifyIndustry(choice.getImpactOnIndustry());
				this.country.modifyAgriculture(choice.getImpactOnAgriculture());
				this.country.modifyFood(choice.getImpactOnFood());
				this.country.modifyTreasury(choice.getImpactOnTreasury());
				this.country.getCapitalist().modifySatisfaction(choice.getImpactOnCapitalist());
				this.country.getCommunist().modifySatisfaction(choice.getImpactOnCommunist());
				this.country.getLiberal().modifySatisfaction(choice.getImpactOnLiberal());
				this.country.getReligious().modifySatisfaction(choice.getImpactOnReligious());
				this.country.getMilitarist().modifySatisfaction(choice.getImpactOnMilitarist());
				this.country.getEcologist().modifySatisfaction(choice.getImpactOnEcologist());
				this.country.getNationalist().modifySatisfaction(choice.getImpactOnNationalist());
				this.country.getLoyalist().modifySatisfaction(choice.getImpactOnLoyalist());
				System.out.println("l'ordre a été donné monsieur le president");
			}
		}
	}
}
