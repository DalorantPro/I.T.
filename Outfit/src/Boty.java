
public class Boty {
	String nazevBoty;

	public static Boty factoryAirYeezyRedOctober() {
		return new Boty("Air yeezy 2 Red October");
	}

	public static Boty factoryAirJordan1HomageToHome() {
		return new Boty("Air jordan 1 Homage to home");
	}

	public static Boty factoryHumanRace() {
		return new Boty("Adidas Human race solar pack");
	}

	public static Boty factoryAirJordan4Bred() {
		return new Boty("Air jordan 4 bred");
	}

	public static Boty factoryAirForce1TravisScott() {
		return new Boty("Air Force 1 Travis Scott");
	}

	public static Boty factoryTravisScottDunkLow() {
		return new Boty("Nike sb dunk Travis Scott");
	}

	public static Boty factoryAirJordan1PineGreen() {
		return new Boty("Air jordan 1 Pine green");
	}

	public static Boty factoryYeezy700Waverunner() {
		return new Boty("Yeezy 700 waverunner");
	}

	public static Boty factoryAirJordan1SatinBlackToe() {
		return new Boty("Air jordan 1 black toe satin");
	}

	public static Boty factorySupremeTailwind() {
		return new Boty("Supreme tailwind");
	}

	public static Boty factoryRafSimonsBunny() {
		return new Boty("Raf simons ozweego bunny");
	}
	public static Boty factoryAJ6Travis() {
		return new Boty("Air jordan 6 Travis Scott");
	}
	public static Boty factoryAF1white() {
		return new Boty("Air Force 1 white");
	}
	public static Boty factoryCDGconverse() {
		return new Boty("CDG Converse");
	}
	
	
	private Boty(String nazevBoty) {
		super();
		this.nazevBoty = nazevBoty;

	}

	@Override
	public String toString() {
		return nazevBoty;
	}
}