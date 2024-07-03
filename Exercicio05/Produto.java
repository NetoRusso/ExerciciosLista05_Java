package Aula060207.ExerciciosLista05.Exercicio05;

import java.text.DecimalFormat;


public abstract class Produto implements Caixa {
    private String nome;
    private double preco;
    private int estoque;
    TipoProduto tipo;

    public Produto(String nome, double preco, int estoque, TipoProduto tipo) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public TipoProduto getTipo() {
        return tipo;
    }

   DecimalFormat formato = new DecimalFormat("0.00");


    public void detalheProduto(){

        System.out.println("************************************");
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + formato.format(getPreco()));
        System.out.println("Estoque: " + estoque);
        System.out.println("Tipo: " + tipo);
        System.out.println("************************************");
    }

    public void aplicarDesconto(int desconto){
         preco = preco - (preco * desconto / 100);
        System.out.println("Desconto aplicado com sucesso!");
        System.out.println("Novo preço: " + formato.format(getPreco()));
        System.out.println("************************************");

    };

    public void calcularFrete(){
        System.out.println("O frete é de R$ " + formato.format(getPreco() * 0.2));
        System.out.println("************************************");
    };

    public abstract void controlarEstoque();

    public abstract void vender();

}
