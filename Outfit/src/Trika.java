
public class Trika {

	String nazevTrik;

	public static Trika factoryUniqloKaws() {
		return new Trika("Uniqlo x Kaws tee");
	}

	public static Trika factoryCalvinKlein() {
		return new Trika("Calvin Klein tee");
	}

	public static Trika factoryBillionareBoysClub() {
		return new Trika("Billionare Boys Club tee");
	}

	public static Trika factoryBalenciaga() {
		return new Trika("Balenciaga tee");
	}

	public static Trika factorySupremeScarface() {
		return new Trika("Supreme scarface tee");
	}

	public static Trika factoryPleasuresAGIAG() {
		return new Trika("Pleasures AGIAG tee");
	}

	public static Trika factoryKith() {
		return new Trika("Kith tee");
	}

	public static Trika factoryNikeTee() {
		return new Trika("Nike club tee");
	}

	public static Trika factoryPablo() {
		return new Trika("I feel like Pablo tee");
	}

	public static Trika factorySupremeCDG() {
		return new Trika("Supreme cdg tee");
	}
	public static Trika factoryAdidasTee() {
		return new Trika("Adidas tee");
	}
	public static Trika factoryAdidasPharrell() {
		return new Trika("Adidas Pharrel Williams tee");
	}
	public static Trika factorySupremeTupac() {
		return new Trika("Supreme Tupac tee");
	}
	
	private Trika(String nazevTrik) {
		super();
		this.nazevTrik = nazevTrik;
	}

	@Override
	public String toString() {
		return nazevTrik;
	}

}