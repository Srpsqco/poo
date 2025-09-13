public class Main {
    public static void main(String[] args) {
        // Criando três produtos diferentes
        Produto produto1 = new Produto("P001", "Notebook", 2500.00);
        Produto produto2 = new Produto("P002", "Mouse", 50.00);
        Produto produto3 = new Produto("P003", "Teclado", 120.00);
        
        // Criando um pedido
        Pedido pedido = new Pedido("PD1001", "15/03/2024");
        
        System.out.println("=== SISTEMA DE PEDIDOS ===");
        System.out.println("Pedido: " + pedido.getNumero());
        System.out.println("Data: " + pedido.getData());
        System.out.println();
        
        System.out.println("=== ADICIONANDO PRODUTOS ===");
        // Adicionando produtos ao pedido
        pedido.adicionarProduto(produto1, 2); // 2 notebooks
        pedido.adicionarProduto(produto2, 3); // 3 mouses
        pedido.adicionarProduto(produto3, 1); // 1 teclado
        pedido.adicionarProduto(produto2, 2); // Mais 2 mouses
        
        System.out.println();
        System.out.println("=== RESUMO DO PEDIDO ===");
        System.out.println("Número do Pedido: " + pedido.getNumero());
        System.out.println("Data: " + pedido.getData());
        System.out.println("Valor Total: R$ " + String.format("%.2f", pedido.getValorTotal()));
        System.out.println();
        
        // Testando com mais produtos
        System.out.println("=== ADICIONANDO MAIS ITENS ===");
        Produto produto4 = new Produto("P004", "Monitor", 800.00);
        pedido.adicionarProduto(produto4, 1); // 1 monitor
        
        System.out.println();
        System.out.println("=== RESUMO FINAL ===");
        System.out.println("Valor Total Atualizado: R$ " + String.format("%.2f", pedido.getValorTotal()));
        
        // Demonstrando cálculo manual para verificação
        System.out.println();
        System.out.println("=== VERIFICAÇÃO DOS CÁLCULOS ===");
        System.out.println("2 x Notebook: 2 * 2500.00 = R$ 5000.00");
        System.out.println("5 x Mouse: 5 * 50.00 = R$ 250.00");
        System.out.println("1 x Teclado: 1 * 120.00 = R$ 120.00");
        System.out.println("1 x Monitor: 1 * 800.00 = R$ 800.00");
        System.out.println("TOTAL: R$ " + String.format("%.2f", (5000.00 + 250.00 + 120.00 + 800.00)));
    }
}