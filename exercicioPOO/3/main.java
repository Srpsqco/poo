public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("12345-6", "João Silva", 1000.0);
        
        System.out.println("=== Conta Bancária ===");
        System.out.println("Número: " + conta.getNumero());
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());
        System.out.println();
        
        System.out.println("--- Operações ---");
        conta.depositar(500.0);
        System.out.println();
        
        boolean saque1 = conta.sacar(200.0);
        System.out.println("Saque realizado: " + saque1);
        System.out.println();
        
        boolean saque2 = conta.sacar(2000.0);
        System.out.println("Saque realizado: " + saque2);
        System.out.println();
        
        conta.depositar(1000.0);
        System.out.println();
        
        boolean saque3 = conta.sacar(-100.0);
        System.out.println("Saque realizado: " + saque3);
        System.out.println();
        
        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
