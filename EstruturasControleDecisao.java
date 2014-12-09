/**
 * Estruturas de controle e decisão.
 * if, else if, else, while, do while, for, switch, case
 * @author rafael
 */
public class EstruturasControleDecisao {
    
    public static void main(String[] args) {
        
        /*
        * If, else if, else
        * Testa as condições, defindo o que fazer de acordo com cada uma.
        */
        int idade = 15;
        
        if ( idade < 12 )
        {
            System.out.println("Criança!");
        }
        else if ( idade > 11 && idade < 18 )
        {
            System.out.println("Adolescente!");
        }
        else
        {
            System.out.println("Adulto!");
        }
        
        System.out.println("---------------");
        
        /*
        * While.
        * Executa uma instrução enquanto a condição for verdadeira.
        */
        int numero = 0;
        
        while ( numero < 10 )
        {
            System.out.println(numero);
            numero++; // Incrementa o valor da variável em 1.
        }
        
        System.out.println("---------------");
        
        /*
        * Do while.
        * Executa a instrução pelo menos uma vez, e continua enquanto ela for 
        * verdadeira.
        */
        int nota = 0;
        
        do
        {
            System.out.println("Reprovado!");
            nota++;
        }
        while ( nota < 6 ); // Enquanto essa condição for verdadeira, executa o código contido no "do".
        
        System.out.println("---------------");
        
        /*
        * Executa a instrução para a condição verdadeira. Possui 3 argumentos:
        * for (declaração inicial; expressão lógica; salto)
        * {
        * instruções;...
        * }
        * declaração inicial - inicializa uma variável para o laço;
        * expressão lógica - compara a variável do laço com um valor limite;
        * salto - atualiza o valor da variável do laço.
        */
        for ( int i = 0; i < 10; i++)
        {
            System.out.println("Item: " + i);
        }
        
        System.out.println("---------------");
        
        /*
        * Executa a instrução caso a variável atenda a determinada condição.
        */
        int diaDaSemana = 4;
        switch (diaDaSemana)
        {
            case 1:
                System.out.println("Hoje é Domingo");
                break;
            case 2:
                System.out.println("Hoje é Segunda-Feira");
                break;
            case 3:
                System.out.println("Hoje é Terça-Feira");
                break;
            case 4:
                System.out.println("Hoje é Quarta-Feira");
                break;
            case 5:
                System.out.println("Hoje é Quinta-Feira");
                break;
            case 6:
                System.out.println("Hoje é Sexta-Feira");
                break;
            case 7:
                System.out.println("Hoje é Sábado");
                break;
            default:
                System.out.println("Este não é um dia válido!");
        }
    }
}