package engsoft.jogo.patos;

// clase pública que implementa o metodo voar de padroes voaveis
public class Voar_Raso implements Padrao_Voaveis {
	
	private double velocidade; // isso é uma variável de instância

	// metodos publicos e concretos
	public Voar_Raso() {
		velocidade = 100;
	}

	// Polimorfismo = sobreposição ou override, permite sobrepor métodos de uma classe
	@Override
	public String voar() {
		return "Voando perto do ch�o. Velocidade: "
				+ getVelocidade();
	}

	@Override
	public double getVelocidade() {
		return velocidade;
	}

}
