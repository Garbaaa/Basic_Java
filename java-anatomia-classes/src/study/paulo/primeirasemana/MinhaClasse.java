package study.paulo.primeirasemana;
public class MinhaClasse {

    public static void main (String [] args){
        System.out.println("Hello World");
        String primeiroNome = "Paulo";
        String segundoNome = "Alex";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome); // metodo

        System.out.println(nomeCompleto);

        final String BR = "Brasil"; // variavel que não pode mudar
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
    
}
