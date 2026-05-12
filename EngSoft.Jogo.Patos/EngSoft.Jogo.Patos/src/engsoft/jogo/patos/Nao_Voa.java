package engsoft.jogo.patos;

// A classe pública permite que ela seja vista por todas as demais e implementa o padrão voaveis
public class Nao_Voa implements Padrao_Voaveis {
	// Metodo concreto
	public Nao_Voa()
	{
			
	}
	// Outro metodo concreto (junto ao debaixo)
	public String voar() {
		return "Esse pato n�o Voa. Velocidade: " + getVelocidade();
	}

	public double getVelocidade() {
		return 0;
	}

}
