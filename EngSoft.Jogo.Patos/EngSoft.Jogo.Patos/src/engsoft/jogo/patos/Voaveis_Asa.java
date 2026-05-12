package engsoft.jogo.patos;

// classe publica que implementa o metodo voar de padrao voaveis
public class Voaveis_Asa implements Padrao_Voaveis {

	private double velocidade;

	// metodos publicos e concretos
	public Voaveis_Asa() {
		velocidade = 10;
	}

	public String voar() {
		return "Voando como um p�ssaro que voa. Velocidade: "
				+ getVelocidade();
	}

	public double getVelocidade() {
		return velocidade;
	}

}
