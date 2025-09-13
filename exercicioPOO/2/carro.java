public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeAtual;
    
    public Carro() {
        this.marca = "";
        this.modelo = "";
        this.ano = 0;
        this.velocidadeAtual = 0;
    }
    
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }
    
    public void acelerar(int valor) {
        this.velocidadeAtual += valor;
        System.out.println("Acelerando! Velocidade atual: " + this.velocidadeAtual + " km/h");
    }
    
    public void frear(int valor) {
        if (this.velocidadeAtual - valor >= 0) {
            this.velocidadeAtual -= valor;
        } else {
            this.velocidadeAtual = 0;
        }
        System.out.println("Freando! Velocidade atual: " + this.velocidadeAtual + " km/h");
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
}

