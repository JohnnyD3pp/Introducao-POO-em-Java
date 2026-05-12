package engsoft.jogo.patos;

public class Coelho {

    // Composição
    protected Padrao_Pulaveis comportamento_coelho;

    // Assume o comportamento padrão de pular
    public void setComportamentoCoelho(Padrao_Pulaveis padrao )
    {
        comportamento_coelho = padrao;
    }

    // Retorna o comportamento (metodo) pular. Delegação
    public String comportamento_coelho()
    {
        return comportamento_coelho.pular();
    }

    // metodo concreto e publico
    // Assume o comportamento pular certinho
    public Coelho() {setComportamentoCoelho(new Pular_Certinho());}
}
