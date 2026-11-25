import java.util.Random;

public class Exercicio {
    private int a, b;
    private char operacao;
    private Random r = new Random();

    public Exercicio(char[] operacoes, int digitsa, int digitsb, String escolhasExercicio) {
        this.operacao = operacoes[r.nextInt(operacoes.length)];

        a = r.nextInt(Math.powExact(10, digitsa) - Math.powExact(10, digitsa - 1)) + Math.powExact(10, digitsa - 1);
        b = r.nextInt(Math.powExact(10, digitsb) - Math.powExact(10, digitsb - 1)) + Math.powExact(10, digitsb - 1);
    }

    public String getExercise() {
        return a + " " + operacao + " " + b + " = ";
    }

    public double getAnswer() {
        switch (operacao) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            default:
                return a / b;
        }
    }
}
