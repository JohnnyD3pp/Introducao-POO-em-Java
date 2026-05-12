package engsoft.jogo.patos;

// classe publica e concreta que implementa o metodo voar do padrao_voaveis
public class Voar_Foguete implements Padrao_Voaveis{

	// isso é uma variável de instância
	private double velocidade;

	// metodos publicos e concretos
	public Voar_Foguete()
	{
		velocidade = 1000;	
	}
	
	public String voar() {
		return "Voando como um foguete. Velocidade: " + getVelocidade();		
	}

	public double getVelocidade() {
		return velocidade;
	}	
}
