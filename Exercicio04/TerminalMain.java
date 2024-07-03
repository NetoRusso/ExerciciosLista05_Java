package Aula060207.ExerciciosLista05.Exercicio04;

/*
Desafio 4: Sistema de Transporte Público

Descrição:
Crie um sistema de gerenciamento de transporte público. Use uma enumeração para representar os diferentes tipos de transporte (Ônibus, Trem, Metrô). Defina uma classe abstrata `Transporte` com atributos comuns como número de assentos, capacidade e tarifa, e métodos abstratos para calcular a tarifa total e imprimir os detalhes do transporte. Crie subclasses para os diferentes tipos de transporte e implemente os métodos abstratos. Utilize interfaces para definir comportamentos adicionais, como manutenção e horário de funcionamento.

Requisitos:
- Enumeração para tipos de transporte.
- Classe abstrata `Transporte` com atributos e métodos abstratos.
- Subclasses para Ônibus, Trem e Metrô.
- Interfaces para manutenção e horário de funcionamento.
 */

public class TerminalMain {
    public static void main(String[] args) {

        Transporte onibus = new Onibus(45, 5.25, TipoTransporte.ONIBUS);
        Transporte trem = new Trem(100, 15, TipoTransporte.TREM);
        Transporte metro = new Metro(100, 2.5, TipoTransporte.METRO);

        onibus.calcularTarifa(10);
        trem.calcularTarifa(5);
        metro.calcularTarifa(4);

        metro.manutencao();
        onibus.manutencao();
        trem.manutencao();

        onibus.funcionamento();
        trem.funcionamento();
        metro.funcionamento();

        onibus.imprimirTransporte();
        trem.imprimirTransporte();
        metro.imprimirTransporte();

    }
}
