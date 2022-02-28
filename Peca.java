package modelo;

//Vamos modelar nessa classe tudo que uma Peça tem
public abstract class Peca {
    //Aqui não criaremos nenhum objeto porque no jogo cada peça tem uma atribuição específica (bisco, cavalo, etc).
    //O usuário futuro não podera criar uma peça (objeto). Um "New peça". Por isso, ela é abstrata.
     private EnumCor cor;
    
     //o tabuleiro de linhas e colunas
     private int linha, coluna;
   
    //cada uma das peças precisa de uma imagem que a represente
    private String imagem;
    
    //É necessária uma marcação pra saber se a peça foi eliminada ou não e se ela está selecionada para movimentação ou não:
    private boolean eliminado = false;
    private boolean selecionada = false;

    //Cada peça tem um momvimento individual que precisa ser válido:
    public abstract boolean validaMovimento(int linhaDestino, int colunaDestino);

    //Metodo construtor para que tenhamos que definir as infos fundamentais das peças:
    public Peca(EnumCor cor, int linha, int coluna, String imagem) {
        this.cor = cor;
        this.linha = linha;
        this.coluna = coluna;
        this.imagem = imagem;
    }

    //Como os atributos da classe são privados, precisamos criar os getters e setters para que as classes filhas possam acessar:

    public EnumCor getCor(){
        return this.cor;
    }

    public void setCor(EnumCor cor){
        this.cor = cor;
    }

    public int getLinha(){
        return this.linha;
    }

    public void setLinha(int linha){
        this.linha = linha;
    }

    public int getColuna(){
        return this.coluna;
    }

    public void setColuna(int coluna){
        this.coluna = coluna;
    }
}



    