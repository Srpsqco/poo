public class Carro extends Veiculo {
    private int qtdPortas;
    
    public Carro() {
        super();
        this.qtdPortas = 0;
    }
    
    public Carro(String marca, String modelo, int ano, double valorBase, int qtdPortas) {
        super(marca, modelo, ano, valorBase);
        this.qtdPortas = qtdPortas;
    }
    
    public int getQtdPortas() {
        return qtdPortas;
    }
    
    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
    
    public double calcularValorRevenda() {
        int anosUso = 2024 - getAno(); // Considerando o ano atual como 2024
        double descontoPorAno = 0.10; // 10% por ano
        double valorRevenda = getValorBase() * Math.pow(1 - descontoPorAno, anosUso);
        return Math.max(valorRevenda, 0); // Não permite valor negativo
    }
}

