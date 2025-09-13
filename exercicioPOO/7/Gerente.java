public class Gerente extends Funcionario {
    private double bonusMensal;
    
    public Gerente() {
        super();
        this.bonusMensal = 0.0;
    }
    
    public Gerente(String nome, String matricula, double salarioBase, double bonusMensal) {
        super(nome, matricula, salarioBase);
        this.bonusMensal = bonusMensal;
    }
    
    public double getBonusMensal() {
        return bonusMensal;
    }
    
    public void setBonusMensal(double bonusMensal) {
        this.bonusMensal = bonusMensal;
    }
    
    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + bonusMensal;
    }
}

