import java.util.Scanner;

/**
 * Como receber entrada de dados do usuário.
 * @author rafael
 */
public class EntradaDeDados {
    
    public static void main(String[] args) {
        /**
         * Faremos uso de um dos métodos da classe Scanner. Exemplo de alguns:
         * scanner.next() - entradas em formato String. ex: String i = scanner.next();
         * scanner.nextInt() - entradas em formato números inteiros. ex: int i = scanner.nextInt();
         * scanner.nextLong() - entradas em formato números inteiros longos. ex: long i = scanner.nextLong();
         * scanner.nextFloat() - entradas em formato números ponto flutuante. ex: float i = scanner.nextFloat();
         * scanner.nextDouble() - entradas em formato números decimais. ex: Double i = scanner.nextDouble();
         */
        Scanner scn = new Scanner(System.in); // Objeto da classe Scanner.
        System.out.println("Digite seu nome: "); // Solicitação da entrada do usuário.
        String nome = scn.next(); // O método next() do objeto Scanner captura a entrada do usuário e é atribuído à variável.
        System.out.println("Bem vindo " + nome); // Apresentação ao usuário do que ele digitou.
    }
}