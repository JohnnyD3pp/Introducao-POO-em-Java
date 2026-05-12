package engsoft.jogo.patos;

// classe publica que implementa o metodo pular de padrao pulaveis
public class Pulaveis implements Padrao_Pulaveis{

    private double altura;

    // metodos publicos e concretos
    public Pulaveis() { altura = 10; }

    public String pular() {
        return "Pulando como um acrobata de circo. Altura: "
                + getAltura();
    }

    public double getAltura() {
        return altura;
    }
}
