package desafios;

import java.util.Scanner;

public class segundoDesafio {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numeroNinjasCadastrados = 0;

        System.out.println("O setor de TI da vila da folha ainda está em desenvolvimento e por isso pedimos sua paciencia");
        System.out.println("Levando isso em conta, me diga... quantos ninjas da sua equipe você deseja cadastrar?");
        System.out.println("Recomendamos cadastrar apenas a sua própria equipe ;) ");
        int numeroNinjas = scan.nextInt();

        String[] ninjas = new String[numeroNinjas];

        while (true){
            System.out.println("CADASTRO DE NINJAS - KONOHA");
            System.out.println("---------------------------");
            System.out.println("1 - Cadastrar novo ninja");
            System.out.println("2 - Listar ninjas cadastrados");
            System.out.println("3 - Sobrescrever ninja cadastrado");
            System.out.println("4 - Apagar ninja cadastrado");
            System.out.println("5 - Finalizar programa");
            System.out.println("---------------------------");
            int opcao = scan.nextInt();


            switch (opcao){
                case 1:
                    System.out.println("Lista de ninjas cadastrados por você: ");
                    System.out.println("--------------------------------------");

                    for (int i = 0; i < numeroNinjas; i++) {
                        System.out.println(i + " - " + ninjas[i]);
                    }

                    System.out.println("--------------------------------------");

                    System.out.println("Por gentileza, informe o nome do ninja a ser cadastrado...");
                    scan.nextLine();
                    String novoNinja = scan.nextLine();

                    ninjas[numeroNinjasCadastrados] = novoNinja;

                    numeroNinjasCadastrados++;

                    break;

                case 2:
                    System.out.println("Lista de ninjas cadastrados por você: ");
                    System.out.println("--------------------------------------");

                    for (int i = 0; i < numeroNinjas; i++) {
                        System.out.println(i + " - " + ninjas[i]);
                    }

                    break;

                case 3:
                    System.out.println("Lista de ninjas cadastrados por você: ");
                    System.out.println("--------------------------------------");

                    for (int i = 0; i < numeroNinjas; i++) {
                        System.out.println(i + " - " + ninjas[i]);
                    }

                    System.out.println("---------------------------------------");
                    System.out.println("Digite o número referente ao ninja que você quer alterar o cadastro");
                    int ninjaCadastroAlterado = scan.nextInt();

                    System.out.println("---------------------------------------");
                    System.out.println("Por gentileza, informe o nome do ninja a ser cadastrado...");
                    scan.nextLine();
                    String nomeNinjaAlterado = scan.nextLine();

                    ninjas[ninjaCadastroAlterado] = nomeNinjaAlterado;

                    System.out.println("---------------------------------------");
                    System.out.println("Cadastro alterado com sucesso");

                    break;

                case 4:
                    System.out.println("Lista de ninjas cadastrados por você: ");
                    System.out.println("--------------------------------------");

                    for (int i = 0; i < numeroNinjas; i++) {
                        System.out.println(i + " - " + ninjas[i]);
                    }

                    System.out.println("---------------------------------------");
                    System.out.println("Digite o número referente ao ninja que você quer apagar o cadastro");
                    int ninjaCadastroApagado = scan.nextInt();

                    ninjas[ninjaCadastroApagado] = "";

                    numeroNinjasCadastrados--;

                    break;

                case 5:
                    System.out.println("Ninjas Cadastrados: ");
                    System.out.println("--------------------------------------");

                    System.out.println("Lista de ninjas cadastrados por você: ");
                    System.out.println("--------------------------------------");

                    for (int i = 0; i < numeroNinjas; i++) {
                        System.out.println(i + " - " + ninjas[i]);
                    }

                    System.out.println("Encerrando a execução do sistema...");

                    break;

                default:
                    System.out.println("Opção inválida, tente novamente");

            }

            if ((opcao == 5) || (numeroNinjasCadastrados == numeroNinjas)){

                System.out.println("Ninjas Cadastrados: ");
                System.out.println("--------------------------------------");

                System.out.println("Lista de ninjas cadastrados por você: ");
                System.out.println("--------------------------------------");

                for (int i = 0; i < numeroNinjas; i++) {
                    System.out.println(i + " - " + ninjas[i]);
                }

                System.out.println("Encerrando a execução do sistema...");

                break;
            }
        }

        scan.close();
    }
}
