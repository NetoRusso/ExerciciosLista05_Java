package Aula060207.ExerciciosLista05.Exercicio02;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, int idade, double salario, Departamentos departamento) {
        super(nome, idade, salario, departamento);
    }

    @Override public void calcularBonus() {
        double bonus = 0;
        bonus = getSalario() * 0.08;

        System.out.println("O Bônus anual do Desenvolvedor é :  R$ " + (bonus * 12));
    }







}
