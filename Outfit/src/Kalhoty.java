public class Kalhoty {
	String nazevKalhot;

	public static Kalhoty factoryCarharrtCargos() {
		return new Kalhoty("Carhartt cargo pants");
	}

	public static Kalhoty factoryFearOfGod() {
		return new Kalhoty("Fear of god essentials sweatpants");
	}

	public static Kalhoty factoryAdidasSweats() {
		return new Kalhoty("Adidas 3 stripes sweatpants");
	}

	public static Kalhoty factoryNikeSweats() {
		return new Kalhoty("Nike sweatpants");
	}

	public static Kalhoty factoryBlackJeans() {
		return new Kalhoty("Black skinny jeans");
	}

	public static Kalhoty factoryBlueJeans() {
		return new Kalhoty("Blue skinny jeans");
	}

	public static Kalhoty factoryBlackDistressedJeans() {
		return new Kalhoty("Black distressed jeans");
	}

	public static Kalhoty factoryBlueDistressedJeans() {
		return new Kalhoty("Blue distressed jeans");
	}

	public static Kalhoty factorySupremePlayboySweats() {
		return new Kalhoty("Supreme playboy sweatpants");
	}

	public static Kalhoty factorySupremeSplitSweats() {
		return new Kalhoty("Supreme split sweatpants");
	}
	public static Kalhoty factoryBrownCargos() {
		return new Kalhoty("Brown cargo pants");
	}
	public static Kalhoty factoryGreyStraight() {
		return new Kalhoty("Grey straight pants");
	}

	
	
	private Kalhoty(String nazevKalhot) {
		super();
		this.nazevKalhot = nazevKalhot;
	}

	@Override
	public String toString() {
		return nazevKalhot;
	}
}