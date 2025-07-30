package condicoes;

public class ifElse {
    public static void main(String[] args) {

        String nome = "Naruto Uzumaki";
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissões = 10;

        if (numeroDeMissões>10){
            System.out.println(nome + " está pronto para ser um chunin");
        }else {
            System.out.println(nome + " não completou o número de missões minimas e portanto não pode se tornar um chunin");
        }

    }
}
