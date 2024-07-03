package Aula060207.ExerciciosLista05.Exercicio01;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Caixa {


    DecimalFormat formato = new DecimalFormat("00.00");

    public void fecharComanda(ArrayList <Refeicao> lista) {

        double precoFinal = 0;

        System.out.println("""
                                ************************************************************
                                Comanda fechada com sucesso!\n 
                                """);

        for (Refeicao refeicao : lista) {
            double preco = refeicao.getPreco();
            String nome = refeicao.getNome();
            boolean promocao = refeicao.getPromocao();
            if (promocao) {
                preco = preco * 0.9;
            }
            precoFinal += preco;
            System.out.println(STR."\{nome} ----------------------------------R$ \{formato.format(preco)}");
        }



        System.out.println(STR."""


               Total ----------------------------------R$ \{formato.format(precoFinal)}

            ***********************************************************

            """);
    }

};



