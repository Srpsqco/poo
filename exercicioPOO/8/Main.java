public class Main {
    public static void main(String[] args) {
        // Criando um carro com 5 anos de uso
        Carro carro = new Carro("Toyota", "Corolla", 2019, 80000.0, 4);
        
        // Criando uma moto com 3 anos de uso
        Moto moto = new Moto("Honda", "CB 500", 2021, 30000.0, 500);
        
        System.out.println("=== VALOR DE REVENDA DE VEÍCULOS ===");
        System.out.println();
        
        System.out.println("=== Carro ===");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Portas: " + carro.getQtdPortas());
        System.out.println("Valor Base: R$ " + carro.getValorBase());
        System.out.println("Valor de Revenda: R$ " + String.format("%.2f", carro.calcularValorRevenda()));
        System.out.println();
        
        System.out.println("=== Moto ===");
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Ano: " + moto.getAno());
        System.out.println("Cilindradas: " + moto.getCilindradas() + "cc");
        System.out.println("Valor Base: R$ " + moto.getValorBase());
        System.out.println("Valor de Revenda: R$ " + String.format("%.2f", moto.calcularValorRevenda()));
        System.out.println();
        
        // Testando com veículos mais antigos
        System.out.println("=== VEÍCULOS MAIS ANTIGOS ===");
        System.out.println();
        
        Carro carroAntigo = new Carro("Fiat", "Uno", 2010, 25000.0, 2);
        Moto motoAntiga = new Moto("Yamaha", "XTZ 250", 2008, 15000.0, 250);
        
        System.out.println("Carro Antigo (2010): R$ " + String.format("%.2f", carroAntigo.calcularValorRevenda()));
        System.out.println("Moto Antiga (2008): R$ " + String.format("%.2f", motoAntiga.calcularValorRevenda()));
    }
}