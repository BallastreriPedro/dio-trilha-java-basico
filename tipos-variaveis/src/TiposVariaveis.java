public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        String nome = "Pedro"; // Tipo para palavras
        int idade = 22; // Tipo para numeros inteiros
        double peso = 68.5; //Tipo para numeros com ponto 
        char sexo = 'M'; //Tipo para apenas um caractere
        boolean doadorOrgao = false; //Tipo para verdadeiro ou falso
        

        int a = 6;
        int b = 6;
        int resultado = a == b ? 1 : 0;
        System.out.print(resultado); // operador ternario, verifica se a condição é verdadeira ou falsa. Se verdadeira, retorna o valor após o "?", caso contrario, retornara o valor após o ":".
    }
}
