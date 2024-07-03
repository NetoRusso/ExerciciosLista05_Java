package Aula060207.ExerciciosLista05.Exercicio01;
/*
Desafio 1: Sistema de Pedidos em um Restaurante

        Descrição:
        Crie um sistema de pedidos para um restaurante que tenha diferentes tipos de refeições (Entrada, Prato Principal, Sobremesa). Use uma enumeração para representar os diferentes tipos de refeições. Defina uma classe abstrata `Refeicao` com atributos comuns como nome e preço, e métodos abstratos para calcular o valor total e imprimir os detalhes da refeição. Crie subclasses para cada tipo de refeição e implemente os métodos abstratos. Use interfaces para definir comportamentos adicionais, como descontos e ofertas especiais.

        Requisitos:
        - Enumeração para tipos de refeições.
        - Classe abstrata `Refeicao` com atributos e métodos abstratos.
        - Subclasses para Entrada, Prato Principal e Sobremesa.
        - Interfaces para descontos e ofertas especiais.
*/

import java.util.ArrayList;

public class ComandaMain {
    public static void main(String[] args) {


        Refeicao batata = new Entrada("Batata Frita", "Batata frita com queijo provolone", 29.99, true, Cardapio.ENTRADA);
        batata.preparando();

        Refeicao massa = new PratoPrincipal("Macarrão a carbonara", "Massa fresca com bacon,ovos e parmesão", 69.99, true, 2, Cardapio.PRATO_PRINCIPAL);
        massa.preparando();

        Refeicao pettitGatue = new Sobremesa("Pettit Gâtue", "Bolo de chocolate com calda quente servido com uma bola de sorvete de baunilha e cerejas", 19.99, false, Cardapio.SOBREMESA);
        pettitGatue.preparando();

        ArrayList<Refeicao> comanda = new ArrayList<>();
        comanda.add(batata);
        comanda.add(massa);
        comanda.add(pettitGatue);


        Caixa caixa = new Caixa();
        caixa.fecharComanda(comanda);


    }
}
