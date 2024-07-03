package Aula060207.ExerciciosLista05.Exercicio03;

/*
Desafio 3: Sistema de Biblioteca

Descrição:
Implemente um sistema de gerenciamento de uma biblioteca. Use uma enumeração para representar os diferentes gêneros de livros (Ficção, Não-Ficção, Científico). Crie uma classe abstrata `ItemBiblioteca` com atributos comuns como título, autor e ano de publicação, e métodos abstratos para calcular a multa por atraso e imprimir os detalhes do item. Crie subclasses para Livros, Revistas e DVDs, e implemente os métodos abstratos. Use interfaces para definir comportamentos adicionais, como empréstimo e devolução.

Requisitos:
- Enumeração para gêneros de livros.
- Classe abstrata `ItemBiblioteca` com atributos e métodos abstratos.
- Subclasses para Livros, Revistas e DVDs.
- Interfaces para empréstimo e devolução.
*/

public class BalcaoMain {
    public static void main(String[] args) {

        ItemBiblioteca livro = new Livros("Código Limpo", "Robert Cecil Martin", 2012, Genero.CIENTIFICO);
        ItemBiblioteca revista = new Revista("Galileu (Última Edição)", "Editora Globo", 2019, Genero.NAOFICCAO);
        ItemBiblioteca dvd = new DVDs("Civil War", "Alex Garland", 2024, Genero.CIENTIFICO);

        livro.imprimir();
        revista.imprimir();
        dvd.imprimir();

        livro.emprestimo();
        revista.emprestimo();
        dvd.emprestimo();

        livro.multa(1);
        revista.multa(2);
        dvd.multa(3);

        livro.devolucao();
        revista.devolucao();
        dvd.devolucao();
    }
}
