public class Operadores {
    public static main (String[] args){

        String nomeCompleto = "João" + "Pedro"; //concatenação quando tipo String (resultado = "João Pedro")
        int conta = 1 + 1; //adição quando tipo inteiro (resultado = 2)
        double divisao = 10 / 5; // divisão (resultado = 2)
        int multiplicacao = 10 * 5 // multiplicação (resultado = 50)
        int restoDivisao = 10 % 2 //resto da divisão, é o valor que sobra após a divisão de dois números inteiros. (resultado = 0)

        int a = 6;
        int b = 6;
        int resultado = a == b ? 1 : 0;
        System.out.print(resultado); // operador ternario, verifica se a condição é verdadeira ou falsa. Se verdadeira, retorna o valor após o "?", caso contrario, retornara o valor após o ":".
    }

}