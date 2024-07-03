package Aula060207.ExerciciosLista05.Exercicio01;

public abstract class Refeicao implements oferta {
    private String nome;
    private String descricao;
    private double preco;
    private boolean promocao;


    public Refeicao(String nome, String descricao, double preco, boolean promocao) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.promocao = promocao;

    }

//    getters

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public boolean getPromocao() {
        return promocao;
    }


//    Setters


    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
    }


    //    Métodos

    public abstract void preparando();

    public void aplicarOferta(boolean promocao) {
        if (promocao) {
            preco = preco * 0.9;
        }
    }


}
