package condicoes;

import java.util.Scanner;

public class switchCases {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha um ninja - Digite aoenas o seu número:\n1- Narutinho\n2- Sasukezinho\n3- Sakurazinha");
        int escolha = scan.nextInt();

        switch (escolha){
            case 1:
                System.out.println("Narutinho Usuckraki foi sua escolha");
                break;

            case 2:
                System.out.println("Emo revoltado foi sua escolha");
                break;

            case 3:
                System.out.println("Inutil cor de rosa foi sua escolha");
                break;

            default:
                System.out.println("Tu é burro pra krlh, escolhe certo");
        }

        scan.close();
    }
}
