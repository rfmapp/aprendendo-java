import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class MetodosPropriosRetornoParametros {
    
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        entradaTeste();
    }
    
    public static void entradaTeste()
    {
        System.out.println("Digite sua mensagem: ");
        String mensagem = entrada.nextLine();
        
        /*
        * Exibição do retorno do método Ola.
        */
        System.out.println(Ola(mensagem));
    }
    
    /*
    * Método que tráz algum retorno de acordo com o resultado do teste de condição.
    */
    public static String Ola(String mensagem)
    {
        if (mensagem.equals("Oi"))
        {
            return "Olá!";
        }
        else
        {
            return "Adeus!";
        }
    }
}