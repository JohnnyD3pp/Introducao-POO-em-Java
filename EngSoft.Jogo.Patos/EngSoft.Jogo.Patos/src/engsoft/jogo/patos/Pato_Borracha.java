package engsoft.jogo.patos;

// classe publica e concreta que estende pato (herda pato)
public class Pato_Borracha extends Pato {

	// metodos concretos e publicos, assume o comportamento de não voar e não pular
	public Pato_Borracha() { setComportamento(new Nao_Voa());
	setComportamentoPular(new Nao_Pula());}

	// polimorfismo modificando o "comportamento" ao mostrar
	public String mostrar() {
		return "Ol�, eu sou de Boarracha.";
	}
	
}
