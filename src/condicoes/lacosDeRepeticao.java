package condicoes;

import java.util.Scanner;

public class lacosDeRepeticao {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numeroInicialDeClones = 0;
        int numeroFinalDeClones = 20;

        while (numeroInicialDeClones < numeroFinalDeClones){
            numeroInicialDeClones++;
            System.out.println(numeroInicialDeClones);
        }

        System.out.println("-----------------------------------------------");

        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        scan.close();
    }
}
