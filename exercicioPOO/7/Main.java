public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos Silva", "G001", 8000.0, 2000.0);
        Vendedor vendedor = new Vendedor("Ana Souza", "V001", 3000.0, 1500.0);
        
        System.out.println("=== Dados do Gerente ===");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Matrícula: " + gerente.getMatricula());
        System.out.println("Salário Base: R$ " + gerente.getSalarioBase());
        System.out.println("Bônus Mensal: R$ " + gerente.getBonusMensal());
        System.out.println("Salário Final: R$ " + gerente.calcularSalarioFinal());
        System.out.println();
        
        System.out.println("=== Dados do Vendedor ===");
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Matrícula: " + vendedor.getMatricula());
        System.out.println("Salário Base: R$ " + vendedor.getSalarioBase());
        System.out.println("Comissão: R$ " + vendedor.getComissao());
        System.out.println("Salário Final: R$ " + vendedor.calcularSalarioFinal());
        System.out.println();
        
        // Testando atualização de salário
        System.out.println("=== Atualização de Salários ===");
        gerente.atualizarSalario(10.0);
        vendedor.atualizarSalario(5.0);
        System.out.println();
        
        System.out.println("=== Salários Atualizados ===");
        System.out.println("Novo Salário Gerente: R$ " + gerente.calcularSalarioFinal());
        System.out.println("Novo Salário Vendedor: R$ " + vendedor.calcularSalarioFinal());
    }
}