package engsoft.jogo.patos;

// clase pública que implementa o metodo pular de padroes puláveis
public class Pular_Certinho implements Padrao_Pulaveis{

    // isso é uma variável de instância
    private double altura;

    // Metodos públicos e concretos
    public Pular_Certinho() { altura = 15; }

    public String pular() { return "Pulando pulando... Nossa, É UM COELHO!. Altura: " + getAltura(); }

    public double getAltura() { return altura; }
}
