/**
 * Como fazer operações matemáticas com Java.
 * @author rafael
 */
public class OperacoesMatematicas {
    
    public static void main(String[] args) {
        /**
         * Operadores matemáticos:
         * '*' - multiplicação;
         * '/' - divisão;
         * '%' - resto da divisão;
         * '-' - subtração;
         * '+' - adição;
         */
        int n1 = 10;
        int n2 = 5;
        int n3 = 21;
        int n4 = 3;
        
        // Adição.
        int soma = n1 + n2;
        System.out.println("A adição é " + soma);
        // ou pode ainda ser feito assim:
        System.out.println("A adição é " + (n1 + n2));
        System.out.println("");
        
        // Subtração.
        int subtracao = n3 - n1;
        System.out.println("A subtração é " + subtracao);
        System.out.println("");
        
        // Multiplicação.
        int multiplicacao = n2 * n4;
        System.out.println("A Multiplicação é " + multiplicacao);
        System.out.println("");
        
        // Divisão.
        int divisao = n3 / n4;
        System.out.println("A divisão é " + divisao);
        System.out.println("");
        
        /**
         * Potenciação.
         * Precisamos fazer uso do método pow, da classe Math.
         */
        int base = 2;
        int expoente = 5;
        int potenciacao = (int)(Math.pow(base, expoente)); // No lugar das variáveis poderíamos colocar diretamente os números.
        System.out.println("A potência de 2 elevado a 5 é " + potenciacao);
    }
}