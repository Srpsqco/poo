public class Produto {
    private String codigo;
    private String nome;
    private double precoUnitario;
    
    public Produto() {
        this.codigo = "";
        this.nome = "";
        this.precoUnitario = 0.0;
    }
    
    public Produto(String codigo, String nome, double precoUnitario) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPrecoUnitario() {
        return precoUnitario;
    }
    
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}

