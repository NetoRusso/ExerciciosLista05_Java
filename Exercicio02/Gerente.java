package Aula060207.ExerciciosLista05.Exercicio02;

public class Gerente extends Funcionario {

    public Gerente(String nome, int idade, double salario, Departamentos departamento) {
        super(nome, idade, salario, departamento);
    }

    @Override public void calcularBonus() {
        double bonus = 0;
        bonus = getSalario() * 0.1;

        System.out.println("O Bônus anual do Gerente é :  R$ " + (bonus * 12));
    }

}
