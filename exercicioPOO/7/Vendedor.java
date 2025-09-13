public class Vendedor extends Funcionario {
    private double comissao;
    
    public Vendedor() {
        super();
        this.comissao = 0.0;
    }
    
    public Vendedor(String nome, String matricula, double salarioBase, double comissao) {
        super(nome, matricula, salarioBase);
        this.comissao = comissao;
    }
    
    public double getComissao() {
        return comissao;
    }
    
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + comissao;
    }
}

