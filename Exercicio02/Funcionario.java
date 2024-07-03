package Aula060207.ExerciciosLista05.Exercicio02;

import java.util.Random;

public abstract class Funcionario implements Avaliacao{
    private String nome;
    private int idade;
    private double salario;
    Departamentos departamento;

    public Funcionario(String nome, int idade, double salario, Departamentos departamento) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract void calcularBonus();

    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
        System.out.println("Departamento: " + departamento);
        calcularBonus();
    };

    public void treinamento(boolean sn){
        if(sn){
            System.out.println(STR."O funcionario \{getNome()} esta treinando.");
        }
        System.out.println(STR."O funcionario \{getNome()} não esta treinando.");
    }

    public void desempenho(){
        Random desempenho = new Random();
        int resultado = desempenho.nextInt(11);
        if(resultado < 5){
            System.out.println(STR."O desempenho do funcionario \{getNome()} está ruim com a nota \{resultado}.");
        } else if(resultado > 5 && resultado < 8){
            System.out.println(STR."O desempenho do funcionario \{getNome()} está bom com a nota \{resultado}.");
        } else {
            System.out.println(STR."O desempenho do funcionario \{getNome()} está excelente com a nota \{resultado}.");
        }
    }

}
