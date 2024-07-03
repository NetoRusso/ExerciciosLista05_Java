package Aula060207.ExerciciosLista05.Exercicio02;

/*
Desafio 2: Sistema de Gerenciamento de Funcionários

Descrição:
Desenvolva um sistema de gerenciamento de funcionários para uma empresa. Use uma enumeração para representar os diferentes departamentos (TI, RH, Marketing). Crie uma classe abstrata `Funcionario` com atributos comuns como nome, idade e salário, e métodos abstratos para calcular o bônus anual e imprimir os detalhes do funcionário. Crie subclasses para diferentes tipos de funcionários (Gerente, Desenvolvedor, Analista) e implemente os métodos abstratos. Utilize interfaces para definir comportamentos adicionais, como avaliação de desempenho e treinamento.

Requisitos:
- Enumeração para departamentos.
- Classe abstrata `Funcionario` com atributos e métodos abstratos.
- Subclasses para Gerente, Desenvolvedor e Analista.
- Interfaces para avaliação de desempenho e treinamento.
 */


public class GestaoMain {
    public static void main(String[] args) {

        Funcionario colaborador01 = new Analista("Joao", 25, 4600.00, Departamentos.MARKETING);
        Funcionario colaborador02 = new Gerente("Maria", 25, 7800.00, Departamentos.RH);
        Funcionario colaborador03 = new Desenvolvedor("Pedro", 25, 6500.00, Departamentos.TI);

        colaborador01.imprimirDados();
        colaborador02.imprimirDados();
        colaborador03.imprimirDados();


        colaborador01.treinamento(false);
        colaborador02.treinamento(true);
        colaborador03.treinamento(true);

        colaborador01.desempenho();
        colaborador02.desempenho();
        colaborador03.desempenho();
    }
}
