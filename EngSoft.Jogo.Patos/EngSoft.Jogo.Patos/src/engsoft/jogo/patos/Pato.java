package engsoft.jogo.patos;
// Conceito de classe - Classe abstrata
// Classes abstratas devem ter ao menos um metodo abstrato e não podem ser instanciadas

// Abstract indica que não é possível criar um objeto, não se usa new nela. Ela é
// usada para definir uma estrutura comum (atributos e métodos) e forçar subclasses
// a implementarem métodos
public abstract class Pato {

// Permite que o atributo seja acessível pelas subclasses e pacote de subclasses. É a composição
// esses dois são variáveis de instância (os comportamentos)
	protected Padrao_Voaveis comportamento_pato;

	protected Padrao_Pulaveis comportamento_pular;

// Metodo abstrato sem implementação, o que define a classe como abstrata.
	abstract String mostrar();

	// metodos concretos e publicos
	public String nadar()
	{
		return "Pato Nadando.";		
	}	

	// Assume o comportamento padrão de voar
	public void setComportamento(Padrao_Voaveis padrao )
	{
		comportamento_pato = padrao;		
	}

	public void setComportamentoPular(Padrao_Pulaveis padrao) { comportamento_pular = padrao;}

	// Retorna o comportamento (metodo) do pato voar. Delegação
	public String comportamento_pato()
	{		
		return comportamento_pato.voar();		
	}

	public String comportamento_pular()
	{
		return comportamento_pular.pular();
	}
}