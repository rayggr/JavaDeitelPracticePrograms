package cap7;

public class Carta {
	private final String palo;
	private final String cara;

	public Carta(String caraCarta, String paloCarta) {
		this.cara = caraCarta;
		this.palo = paloCarta;
	}

	@Override
	public String toString() {
		return cara + " de " + palo;
	}

}
