package Aula060207.ExerciciosLista05.Exercicio01;



public class PratoPrincipal extends Refeicao {

    private int serve;

    public PratoPrincipal(String nome, String descricao, double preco, boolean promocao, int serve, Cardapio pratoPrincipal) {

        super(nome, descricao, preco, promocao);
        this.serve = serve;
    }

    public int getServe() {
        return serve;
    }

    public void setServe(int serve) {
        this.serve = serve;
    }

    @Override
    public void preparando() {
        System.out.println("Preparando " + getNome());
    }

    @Override
    public void aplicarOferta() {

    }
}
