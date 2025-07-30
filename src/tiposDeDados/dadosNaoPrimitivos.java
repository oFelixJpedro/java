package tiposDeDados;

public class dadosNaoPrimitivos {
    public static void main(String[] args) {

        String nome = "Naruto Uzumaki";
        String nomeMaiusculo = nome.toUpperCase();
        String nomeMinusculo = nome.toLowerCase();
        String aldeia = "konoha";

        System.out.println("nome em maiusculo: " + nomeMaiusculo);
        System.out.println("nome em normal: " + nome);
        System.out.println("O nome da aldeia do naruto é: " + aldeia);

    }
}
