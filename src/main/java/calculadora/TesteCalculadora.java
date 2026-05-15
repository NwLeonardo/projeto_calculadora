package calculadora;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        
        System.out.println("--- Testes Funcionais ---");
        c.calc(10, 5, "+");
        c.calc(20, 4, "/");
        
        System.out.println("\n--- Teste de Erro (Divisao por 0) ---");
        try { c.calc(10, 0, "/"); } 
        catch (Exception e) { System.out.println(e.getMessage()); }
    }
}