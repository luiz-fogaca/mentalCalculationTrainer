
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner in = new Scanner(System.in);
        String operacoes = "";
        char answer;
        int digits;

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

            // Definição do número de dígitos para a primeira parcela da soma
            System.out.println("Quantos dígitos para a primeira parcela?");
            digits = in.nextInt();
            operacoes += String.valueOf(digits);
        }

        // Inclusão de problemas de subtração
        System.out.println("Incluir subtração? s/n");
        answer = in.nextLine().charAt(0);
        if (answer == 's') {
            operacoes += '-';
            // Inclusão de problemas de subtração com resultado menor que 0
            System.out.println("Incluir problemas cujo resultado seja negativo? s/n");
            answer = in.nextLine().charAt(0);
            if (answer == 's') {
                operacoes += '-';
            }
        }

        // Inclusão de problemas de multiplicação
        System.out.println("Incluir multiplicação? s/n");
        answer = in.nextLine().charAt(0);
        if (answer == 's') {
            operacoes += '*';
        }

        // Inclusão de problemas de divisão
        System.out.println("Incluir divisão? s/n");
        answer = in.nextLine().charAt(0);
        if (answer == 's') {
            operacoes += '/';
            // Inclusão de problemas de subtração com resultado menor que 0
            System.out.println("Incluir problemas cujo resultado não seja um inteiro? s/n");
            answer = in.nextLine().charAt(0);
            if (answer == 's') {
                operacoes += '/';
            }
        }
    }
}
