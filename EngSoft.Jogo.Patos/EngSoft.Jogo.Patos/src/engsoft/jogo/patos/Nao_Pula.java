package engsoft.jogo.patos;

// A classe pública permite que ela seja vista por todas as demais e implementa o padrão pulaveis
public class Nao_Pula implements Padrao_Pulaveis {
    // Metodo concreto
    public Nao_Pula()
    {

    }
    // Outro metodo concreto (junto ao debaixo)
    public String pular() {
        return "Esse pato num pula :( Altura: " + getAltura();
    }

    public double getAltura() {
        return 0;
    }

}