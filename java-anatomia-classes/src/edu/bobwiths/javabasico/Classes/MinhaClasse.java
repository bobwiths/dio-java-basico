package edu.bobwiths.javabasico.Classes;
public class MinhaClasse {
    public static void main (String [] args) {
        String primeiroNome = "Marcelo";
        String segundoNome = "Carneiro";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
        
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
        
    }

}
