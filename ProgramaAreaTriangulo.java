import java.util.Scanner;

/**
 * Programa que faz o cálculo da área de um triângulo, recebendo os valores de 
 * base e altura do usuário.
 * @author rafael
 */
public class ProgramaAreaTriangulo {
    
    /**
     * Criação do objeto Scanner para receber os dados do usuário.
     * Será do tipo estático, o que significa que não poderá ser instânciado.
     */
    static Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        
        /**
         * Declaração das variáveis.
         * Utilizamos o tipo double pois podemos ter um valor decimal, como por 
         * exemplo 4.5.
         */
        double base;
        double altura;
        
        /**
         * Solicita a entrada de dados ao usuário e atribui da dados à sua 
         * respectiva variável.
         */
        System.out.println("Digite o valor da base do triângulo: ");
        base = scn.nextDouble();
        System.out.println("");
        System.out.println("Digite o valor da altura do triângulo: ");
        altura = scn.nextDouble();
        System.out.println("");
        
        /**
         * Cria uma variável para receber o valor da área do triângulo;
         * Faz o cálculo da área do triângulo;
         * Exibe o valor da área do triângulo ao usuário;
         */
         double area = (base * altura) / 2;
         System.out.println("A área do triângulo é " + area);
    }
}