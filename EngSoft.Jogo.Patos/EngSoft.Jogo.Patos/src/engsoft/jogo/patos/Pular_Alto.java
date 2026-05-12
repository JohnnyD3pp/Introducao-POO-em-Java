package engsoft.jogo.patos;

public class Pular_Alto implements Padrao_Pulaveis{

    // isso é uma variável de instância
    private double altura;

    // metodos publicos e concretos
    public Pular_Alto() { altura = 20; }

    public String pular() {
        return "Pulando pulando pulando BEM ALTO. Altura: " + getAltura();
    }

    public double getAltura() {
        return altura;
    }
}
