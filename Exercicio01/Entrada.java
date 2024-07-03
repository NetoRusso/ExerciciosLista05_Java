package Aula060207.ExerciciosLista05.Exercicio01;

public class Entrada extends Refeicao {


    public Entrada(String nome, String descricao, double preco, boolean promocao, Cardapio entrada) {
        super(nome, descricao, preco, promocao);
    }



    @Override public void preparando() {
        System.out.println("Preparando " + getNome());
    }

    @Override
    public void aplicarOferta() {

    }

}
