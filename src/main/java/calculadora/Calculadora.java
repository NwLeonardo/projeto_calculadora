package calculadora;

/**
 * <strong>Projeto Calculadora - FinançApp</strong>
 * <p>Esta classe fornece operações matemáticas básicas para o motor financeiro.</p>
 * @author Leonardo Souza
 * @version 1.0
 */
public class Calculadora {

    public int r = 0;

    /**
     * @param a Primeiro operando
     * @param b Segundo operando
     * @return Soma de a e b
     */
    public int somar(int a, int b) { return a + b; }

    /**
     * @param a Dividendo
     * @param b Divisor
     * @return Quociente
     * @throws IllegalArgumentException se b for zero
     */
    public int dividir(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Divisao por zero negada.");
        return a / b;
    }

    public int calc(int a, int b, String op) {
        r = switch (op) {
            case "+" -> somar(a, b);
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operador invalido.");
        };
        System.out.println("Resultado: " + r);
        return r;
    }
}