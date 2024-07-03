package Aula060207.ExerciciosLista05.Exercicio01;

public class Sobremesa extends Refeicao {

    public Sobremesa(String nome, String descricao, double preco, boolean promocao, Cardapio sobremesa) {
        super(nome, descricao, preco, promocao);
    }

//    public Sobremesa(){};


    @Override public void preparando(){
        System.out.println("Preparando " + getNome());
    }

    @Override
    public void aplicarOferta() {

    }
}
