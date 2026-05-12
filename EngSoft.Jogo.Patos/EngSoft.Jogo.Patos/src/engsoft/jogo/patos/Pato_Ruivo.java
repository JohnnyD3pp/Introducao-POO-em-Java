package engsoft.jogo.patos;

// / Subclasse devido ao "extends". Pato_ruivo herda de Pato e implementao o metodo grasnar do padrão grasnar (interface)
public class Pato_Ruivo extends Pato implements Padrao_Grasnar{

	// metodos concretos e publicos
	// Assume o comportamento de voar e não pular
	public Pato_Ruivo() {setComportamento(new Voaveis_Asa());
	setComportamentoPular(new Nao_Pula());}

	// polimorfismo modificando o "comportamento" ao mostrar e grasnar
	public String mostrar() {
		return "Eu sou o Pato Ruivo." ;
	}

	public String grasnar() {
		// TODO Auto-generated method stub
		return 	"Que-Que.";
	
	}

}
