package engsoft.jogo.patos;

// Subclasse devido ao "extends". Pato_louco herda de Pato e implementao o metodo grasnar do padrão grasnar (interface)
public class Pato_Louco extends Pato implements Padrao_Grasnar{

    // metodos concretos e publicos
    // Assume o comportamento de voar e pular desordenado
    public Pato_Louco() {setComportamento(new Voaveis_Asa());
    setComportamentoPular(new Pular_Desordenado());}

    // polimorfismo modificando o "comportamento" ao mostrar e grasnar
    public String mostrar() {
        return "Eu sou o pato LOUCO BLÉBLÉLULUWE.";
    }

    public String grasnar() {
        return "BLÉ BLEHWEH";
    }
}
