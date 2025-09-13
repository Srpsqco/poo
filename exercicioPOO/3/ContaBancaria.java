public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;
    
    public ContaBancaria() {
        this.numero = "";
        this.titular = "";
        this.saldo = 0.0;
    }
    
    public ContaBancaria(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
            System.out.println("Novo saldo: R$ " + saldo);
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }
    
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
            System.out.println("Novo saldo: R$ " + saldo);
            return true;
        } else if (valor <= 0) {
            System.out.println("Valor de saque inválido!");
            return false;
        } else {
            System.out.println("Saldo insuficiente! Saldo atual: R$ " + saldo);
            return false;
        }
    }
}
