public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João Silva", 20, "2023001");
        Professor professor = new Professor("Maria Santos", 35, 4500.00);
        
        System.out.println("=== Dados do Aluno ===");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println();
        
        System.out.println("=== Dados do Professor ===");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Idade: " + professor.getIdade());
        System.out.println("Salário: R$ " + professor.getSalario());
    }
}