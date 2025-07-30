package condicoes;

import java.util.Scanner;

public class scannerDoUsuario {
    public static void main(String[] args) {

        Scanner caixaDeTexto = new Scanner(System.in);


        System.out.println("Informe o nome do ninja: ");
        String nomeNinja = caixaDeTexto.nextLine();

        System.out.println("Informe a idade do ninja: ");
        int idadeNinja = caixaDeTexto.nextInt();

        System.out.println("O nome do(a) ninja é: " + nomeNinja);
        System.out.println("A idade do(a) ninja é: " + idadeNinja);

        if (idadeNinja >= 18){
            System.out.println("O ninja é maior de idade");
        }else {
            System.out.println("O ninja é menor de idade");
        }

        caixaDeTexto.close();
    }
}
