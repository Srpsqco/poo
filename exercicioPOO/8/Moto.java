public class Moto extends Veiculo {
    private int cilindradas;
    
    public Moto() {
        super();
        this.cilindradas = 0;
    }
    
    public Moto(String marca, String modelo, int ano, double valorBase, int cilindradas) {
        super(marca, modelo, ano, valorBase);
        this.cilindradas = cilindradas;
    }
    
    public int getCilindradas() {
        return cilindradas;
    }
    
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
    public double calcularValorRevenda() {
        int anosUso = 2024 - getAno(); // Considerando o ano atual como 2024
        double descontoPorAno = 0.05; // 5% por ano
        double valorRevenda = getValorBase() * Math.pow(1 - descontoPorAno, anosUso);
        return Math.max(valorRevenda, 0); // Não permite valor negativo
    }
}
