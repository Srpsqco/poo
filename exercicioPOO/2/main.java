public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2022);
        Carro carro2 = new Carro("Honda", "Civic", 2023);
        
        System.out.println("=== Carro 1 ===");
        System.out.println("Marca: " + carro1.getMarca() + ", Modelo: " + carro1.getModelo() + ", Ano: " + carro1.getAno());
        carro1.acelerar(50);
        carro1.acelerar(30);
        carro1.frear(20);
        carro1.frear(70);
        System.out.println();
        
        System.out.println("=== Carro 2 ===");
        System.out.println("Marca: " + carro2.getMarca() + ", Modelo: " + carro2.getModelo() + ", Ano: " + carro2.getAno());
        carro2.acelerar(80);
        carro2.frear(30);
        carro2.frear(60);
    }
}