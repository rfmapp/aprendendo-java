/**
 * Nesse primeiro programa, iremos demonstrar o uso de comentários, como esse, 
 * exibir mensagens na tela e declarar variáveis.
 * @author rafael
 */
public class ComentariosMensagensVariaveis {
    
    public static void main(String[] args) {
        /*
        * Exibição básica de mensagens na tela.
        */
        System.out.println("Olá mundo! Primeira mensagem do programa.");
        System.out.println(""); // Apenas a impressão de uma linha em branco.
        
        /*
        * Declaração de variáveis.
        */
        int idade = 31;
        String mensagem = "Meu nome é Rafael.";
        boolean escolha = true;
        
        /*
        * Exibição de mensagem na tela com o uso de variáveis.
        */
        System.out.println("Olá! " + mensagem + " Tenho " + idade + " anos.");
    }
}
