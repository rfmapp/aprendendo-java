import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class MetodosPropriosComparacaoStrings {
    
    /*
    * Declaração de objeto da classe Scanner.
    */
    static Scanner entrada = new Scanner(System.in);
    
    /*
    * Método principal da classe.
    */
    public static void main(String[] args) {
        entradaTeste();
    }
    
    /*
    * Método próprio.
    */
    public static void entradaTeste()
    {
        /*
        * Variável que recebe a entrada do objeto Scanner.
        */
        System.out.println("Escreva sua mensagem: ");
        String mensagem = entrada.nextLine();
        
        /*
        * Comparação de Strings.
        */
        if (mensagem.equals("oi"))
        {
            System.out.println("Olá!");
        }
    }
}