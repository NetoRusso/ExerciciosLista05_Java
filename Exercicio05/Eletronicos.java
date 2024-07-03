package Aula060207.ExerciciosLista05.Exercicio05;

public class Eletronicos extends Produto {

    public Eletronicos(String nome, double preco, int estoque, TipoProduto tipo) {
        super(nome, preco, estoque, tipo);
    }

    @Override
    public void controlarEstoque() {
        if (getEstoque() < 0) {
            System.out.println(STR."Não é possível comprar mais \{getNome()}!");
            System.out.println("************************************");
        } else {
            System.out.println(STR."\{getNome()} estoque: " + getEstoque());
            System.out.println("************************************");
        }
    }

    @Override
    public void vender() {
        if (getEstoque() > 0) {
            setEstoque(getEstoque() - 1);
            System.out.println("Compra realizada com sucesso!");
            System.out.println("************************************");
        } else {
            System.out.println("Não é possível comprar mais eletronicos!");
            System.out.println("************************************");
        }
    }



}
