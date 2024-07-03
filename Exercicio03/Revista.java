package Aula060207.ExerciciosLista05.Exercicio03;


public class Revista extends ItemBiblioteca {

    public Revista(String titulo, String autor, int ano, Genero genero) {
        super(titulo, autor, ano, genero);
    }

    @Override
    public void multa(int dias) {
        double valorMulta = dias * 0.90;
        if (dias <= 0) {
            System.out.println(STR."O empréstimo do titulo: \{getTitulo()} está em dia");
        } else {
            System.out.println(STR."O empréstimo do titulo: \{getTitulo()} está com \{dias} dias de atraso, atualmente com uma multa de R$ \{valorMulta} pela pendencia");
        }
    }
}

