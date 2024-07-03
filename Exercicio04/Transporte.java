package Aula060207.ExerciciosLista05.Exercicio04;

import java.text.DecimalFormat;

public abstract class Transporte implements Funcionamento {


    private int assentos;
    private int capacidade;
    private double tarifa;
    TipoTransporte tipo;

    public Transporte(int assentos, double tarifa, TipoTransporte tipo) {
        this.assentos = assentos;
        this.capacidade = assentos * 2;
        this.tarifa = tarifa;
        this.tipo = tipo;
    }


    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public int getCapacidade() {
        return capacidade;
    }


    public double getTarifa(){
        return tarifa;
    }

    public TipoTransporte getTipo() {
        return tipo;
    }


    public void imprimirTransporte() {
        DecimalFormat formato = new DecimalFormat("0.00");

        System.out.println("*******************************************");
        System.out.println("Tipo de Transporte: " + getTipo());
        System.out.println("Assentos: " + getAssentos());
        System.out.println("Capacidade: " + getCapacidade());
        System.out.println("Tarifa: R$" + formato.format(getTarifa()));
        System.out.println("*******************************************");

    }

    public abstract void calcularTarifa(int quantidade);

    public void manutencao(){
        System.out.println("Manutenção do " + getTipo() + " realizada com sucesso!");
    }

    public void funcionamento(){
        System.out.println("Horário de funcionamento do " + getTipo() + " é das 05hs às 23:59hs");
    }

}
