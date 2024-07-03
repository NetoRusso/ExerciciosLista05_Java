package Aula060207.ExerciciosLista05.Exercicio05;

/*
Desafio 5: Sistema de Loja Online

Descrição:
Desenvolva um sistema de gerenciamento para uma loja online. Use uma enumeração para representar os diferentes tipos de produtos (Eletrônicos, Roupas, Alimentos). Crie uma classe abstrata `Produto` com atributos comuns como nome, preço e quantidade em estoque, e métodos abstratos para calcular o valor total do estoque e imprimir os detalhes do produto. Crie subclasses para os diferentes tipos de produtos e implemente os métodos abstratos. Utilize interfaces para definir comportamentos adicionais, como aplicar descontos e calcular frete.

Requisitos:
- Enumeração para tipos de produtos.
- Classe abstrata `Produto` com atributos e métodos abstratos.
- Subclasses para Eletrônicos, Roupas e Alimentos.
- Interfaces para aplicar descontos e calcular frete.
 */

public class LojaMain {
    public static void main(String[] args) {

        Produto maquinaLavaESeca = new Eletronicos("Lava e seca marca Media", 3299.90, 10, TipoProduto.ELETRONICOS);
        Produto blusa = new Roupas("Blusa Balanciaga", 1787.85, 12, TipoProduto.ROUPAS);
        Produto energetico = new Alimentos("Energético Monster Original", 7.75, 300, TipoProduto.ALIMETOS);


        maquinaLavaESeca.detalheProduto();
        blusa.detalheProduto();
        energetico.detalheProduto();

        maquinaLavaESeca.calcularFrete();
        blusa.calcularFrete();
        energetico.calcularFrete();

        maquinaLavaESeca.aplicarDesconto(10);
        blusa.aplicarDesconto(10);
        energetico.aplicarDesconto(10);

        maquinaLavaESeca.vender();
        blusa.vender();
        energetico.vender();

        maquinaLavaESeca.controlarEstoque();
        blusa.controlarEstoque();
        energetico.controlarEstoque();


    }
}
