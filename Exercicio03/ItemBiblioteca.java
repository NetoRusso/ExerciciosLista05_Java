package Aula060207.ExerciciosLista05.Exercicio03;


public abstract class ItemBiblioteca implements EmprestimoEDevolucao {
    private String titulo;
    private String autor;
    private int ano;
    Genero genero;

    public ItemBiblioteca(String titulo, String autor, int ano,  Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Genero getGenero() {
        return genero;
    }

    public void imprimir(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
    };

    public abstract void multa(int dias);

    public void emprestimo(){
        System.out.println(STR."O \{getTitulo()} está sendo emprestado.");
    }

    public void devolucao(){
        System.out.println(STR."O \{getTitulo()} foi devolvido.");
    }
}
