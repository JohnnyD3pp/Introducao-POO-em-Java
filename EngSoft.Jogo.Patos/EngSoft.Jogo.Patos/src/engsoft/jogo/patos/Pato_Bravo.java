package engsoft.jogo.patos;
// Subclasse devido ao "extends". Pato_bravo herda de Pato e implementao o metodo grasnar do padrão grasnar (interface)
public class Pato_Bravo extends Pato implements  Padrao_Grasnar{

	// metodos concretos e publicos
	// Assume o comportamento de voar e não pular
	public Pato_Bravo() {setComportamento(new Voaveis_Asa());
	setComportamentoPular(new Nao_Pula());}

	// polimorfismos modificando o "comportamento" ao mostrar e ao grasnar
	public String mostrar() {		
		return "Eu sou o Pato Bravo.";
	}

	public String grasnar() {
		return "Que-Que. Grrrrrrrrr. (ele te mordeu)";
	}

}
