package engsoft.jogo.patos;
// Main é execução (em tempo de execução)
public class Main {
// O "new" indica a instancia
	public static void main(String[] args) {
	// Pato pt é uma variável do tipo pato louco
		Pato lc = new Pato_Louco();

		Pato pt = new Pato_Atleta();

		Coelho co = new Coelho();

	// Mostra o mostrar(), nadar() e o comportamento()
		System.out.println(pt.mostrar());
		System.out.println(pt.nadar());
		System.out.println(pt.comportamento_pato());
		System.out.println(pt.comportamento_pular());

		// Acontece em tempo de execução (assim como voar raso)
		// Eu mudo o comportamento dele em tempo de execução para desordenado
		pt.setComportamentoPular(new Pular_Desordenado());
		System.out.println(pt.comportamento_pular() + "\n");

		System.out.println(lc.mostrar());
		System.out.println(lc.nadar());
		System.out.println(lc.comportamento_pato());
		System.out.println(lc.comportamento_pular() + "\n");

		System.out.println("Um bichinho estranho apareceu!!!");
		System.out.println(co.comportamento_coelho());

	}

}
