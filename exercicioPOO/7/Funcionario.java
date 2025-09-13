public class Funcionario {
    private String nome;
    private String matricula;
    private double salarioBase;
    
    public Funcionario() {
        this.nome = "";
        this.matricula = "";
        this.salarioBase = 0.0;
    }
    
    public Funcionario(String nome, String matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public double getSalarioBase() {
        return salarioBase;
    }
    
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public double calcularSalarioFinal() {
        return salarioBase;
    }
    
    public void atualizarSalario(double percentualAumento) {
        if (percentualAumento > 0) {
            salarioBase += salarioBase * (percentualAumento / 100);
            System.out.println("Salário atualizado com aumento de " + percentualAumento + "%");
        }
    }
}


