
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner in = new Scanner(System.in);
        String operacoes = "";
        char answer;

        // Título para o usuário
        System.out.println("TREINADOR DE CÁLCULO MENTAL");

        // Inclusão de problemas de adição
        System.out.println("Incluir adição? s/n");
        answer = in.nextLine().charAt(0);
        if (answer == 's') {
            operacoes += '+';
            /* Inclusão de problemas de adição com "vai um" (quando a soma de algarismos de mesma casa decimal é igual ou maior que 10) */
            System.out.println("Incluir problemas com 'vai um'? s/n");
            answer = in.nextLine().charAt(0);
            if (answer == 's') {
                operacoes += '+';
            }
        }
    }
}
