package desafios;

public class primeiroDesafio {
    public static void main(String[] args) {

        String protagonista = "Naruto Uzumaki";
        int idadeProta = 16;
        String missaoProta = "Enfrentar Zabuza Momochi";
        char rankMissaoProta = 'B';
        String statusProta = "Concluido com sucesso";
        String statusDificultadoProta;

        String emo = "Sasuke Uchiha";
        int idadeEmo = 14;
        String missaoEmo = "Deitar Itachi Uchiha na porrada";
        char rankMissaoEmo = 'S';
        String statusEmo = "Sasuke tomou um amasso";
        String statusDificultadoEmo;

        String figurante = "Sakura Haruno";
        int idadeFig = 15;
        String missaoFig = "Lavar a louça";
        char rankMissaoFig = 'D';
        String statusFig = "Em andamento";
        String statusDificultadoFig;

        System.out.println("Exercicio 1 - Facil");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Ninja 1: ");
        System.out.println("Nome do ninja: " + protagonista + "\nIdade do ninja: " + idadeProta + "\nMissão: " + missaoProta + "\nRank da missão: " + rankMissaoProta + "\nStatus da missão: " + statusProta);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Ninja 2: ");
        System.out.println("Nome do ninja: " + emo + "\nIdade do ninja: " + idadeEmo + "\nMissão: " + missaoEmo+ "\nRank da missão: " + rankMissaoEmo + "\nStatus da missão: " + statusEmo);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Ninja 3: ");
        System.out.println("Nome do ninja: " + figurante + "\nIdade do ninja: " + idadeFig + "\nMissão: " + missaoFig + "\nRank da missão: " + rankMissaoFig + "\nStatus da missão: " + statusFig);

        if (idadeProta < 15) {
            if (rankMissaoProta == 'C' || rankMissaoProta == 'D') {
                statusDificultadoProta = "Concluida";
            } else{
                statusDificultadoProta = "não concluida";
            }
        }else{
            statusDificultadoProta = "Concluida";
        }

        if (idadeEmo < 15) {
            if (rankMissaoEmo == 'C' || rankMissaoEmo == 'D') {
                statusDificultadoEmo = "Concluida";
            } else{
                statusDificultadoEmo = "não concluida";
            }
        }else{
            statusDificultadoEmo = "Concluida";
        }

        if (idadeFig < 15) {
            if (rankMissaoFig == 'C' || rankMissaoFig == 'D') {
                statusDificultadoFig = "Concluida";
            } else{
                statusDificultadoFig = "não concluida";
            }
        }else{
            statusDificultadoFig = "Concluida";
        }

        System.out.println("Exercicio 2 - Dificil");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Ninja 1: ");
        System.out.println("Nome do ninja: " + protagonista + "\nIdade do ninja: " + idadeProta + "\nMissão: " + missaoProta + "\nRank da missão: " + rankMissaoProta + "\nStatus da missão: " + statusDificultadoProta);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Ninja 2: ");
        System.out.println("Nome do ninja: " + emo + "\nIdade do ninja: " + idadeEmo + "\nMissão: " + missaoEmo+ "\nRank da missão: " + rankMissaoEmo + "\nStatus da missão: " + statusDificultadoEmo);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Ninja 3: ");
        System.out.println("Nome do ninja: " + figurante + "\nIdade do ninja: " + idadeFig + "\nMissão: " + missaoFig + "\nRank da missão: " + rankMissaoFig + "\nStatus da missão: " + statusDificultadoFig);

        System.out.println("------------------------------------------------------------------");
        System.out.println("Fim do programa, datebayo!");

    }
}
