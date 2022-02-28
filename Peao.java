package modelo;

public class Peao extends Peca {

    //Na primeira joagada todo peao pode andar 1 ou 2 casas para frente e em seguida:
    private boolean primeiroMovimento = true;
    
    //Nas jogadas seguintes, só anda 1 casa em linha reta e só captura na diagonal

    public Peao(EnumCor cor, int linha, int coluna, String imagem)
        super(cor, linha, coluna, imagem);
        //Fazemos a ssinatura do método peao, passando os atributos e encaminho os valores desse contrutor para o construtor da classe pai
        //Se fosse só um método poderia chamar direto, mas nesse caso como é um construtor, precisamos repassar os valores pra classe pai porque a classe peao não tem acesso a classe pai, Peca.
}

//Consireando que o Peao tambem se movimenta, precisamos definir a validacao dessas acoes
    @Override
    public boolean validaMovimento(int linhaDestino, int colunaDestino) {
        //precisamos saber onde a peca esta e pra onde ela vai
        return true;
    }

