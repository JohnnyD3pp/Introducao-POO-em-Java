package engsoft.jogo.patos;

/**
 * Classe de Apito que pode efetuar um grasno
 * Implementa��o da Interface
 * 
 */

// A classe public indica que essa classe pode ser vista por todas as demais classes do meu código
// A classe apito está implementando o padrão grasnar (implementação interface)
// Não sei dizer se essa pode ser chamada de uma classe concreta ou se só vale para métodos

public class Apito implements Padrao_Grasnar{

	// Este é um metodo concreto
	public String grasnar()
	{		
		return "Queeeeee";
	}
}
