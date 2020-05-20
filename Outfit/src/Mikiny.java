public class Mikiny {
	String nazevMikiny;

	public static Mikiny factoryNikeTravisScott() {
		return new Mikiny("Nike Travis Scott hoodie");
	}

	public static Mikiny factorySupremeBoxLogo() {
		return new Mikiny("Supreme box logo hoodie");
	}

	public static Mikiny factoryNike() {
		return new Mikiny("Nike club hoodie");
	}

	public static Mikiny factorySupremePlayboy() {
		return new Mikiny("Supreme playboy hoodie");
	}

	public static Mikiny factoryKithLogo() {
		return new Mikiny("Kith logo hoodie");
	}

	public static Mikiny factoryASSC() {
		return new Mikiny("ASSC kkoch hoodie");
	}

	public static Mikiny factoryPlayboyASSC() {
		return new Mikiny("ASSC Playboy hoodie");
	}

	public static Mikiny factorySupremeCDGPolka() {
		return new Mikiny("Supreme cdg polka hoodie");
	}

	public static Mikiny factoryStussy() {
		return new Mikiny("Stussy hoodie");
	}

	public static Mikiny factorySupremePatchwork() {
		return new Mikiny("Supreme patchwork hoodie");
	}
	public static Mikiny factoryBrownHoodie() {
		return new Mikiny("Brown hoodie");
	}
	public static Mikiny factoryBrownSweater() {
		return new Mikiny("Brown sweater");
	}

	private Mikiny(String nazevMikiny) {
		super();
		this.nazevMikiny = nazevMikiny;
	}

	@Override
	public String toString() {
		return nazevMikiny;
	}
}