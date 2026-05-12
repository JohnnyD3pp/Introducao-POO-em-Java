package engsoft.jogo.patos;

// clase pública que implementa o metodo pular de padroes puláveis
public class Pular_Desordenado implements Padrao_Pulaveis{

    // isso é uma variável de instância
    private double altura;

// Metodos públicos e concretos
    public Pular_Desordenado() { altura = 3; }

    public String pular() {
        return "Pulando, pulando...? Acho que ele está bêbado. Altura: " + getAltura();
    }

    public double getAltura() {
        return altura;
    }
}
