package engsoft.jogo.patos;

public class Pato_Atleta extends Pato implements Padrao_Grasnar{

    // metodos concretos e publicos
    // Assume o comportamento de voar e pular alto
    public Pato_Atleta() {setComportamento(new Voaveis_Asa());
        setComportamentoPular(new Pular_Alto());}

    // polimorfismo modificando o "comportamento" ao mostrar e grasnar
    public String mostrar() {
        return "Eu sou o pato Atleta (Exibe o bíceps).";
    }

    public String grasnar() {
        return "QUÉQUÉ FORTÃO";
    }
}
