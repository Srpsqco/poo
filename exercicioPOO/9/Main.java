public class Main {
    public static void main(String[] args) {
        // Criando um aluno
        Aluno aluno = new Aluno("João Silva", "123.456.789-00", "2023001", 7.5);
        
        // Criando um professor
        Professor professor = new Professor("Maria Santos", "987.654.321-00", "Matemática", 40);
        
        System.out.println("=== SISTEMA ACADÊMICO ===");
        System.out.println();
        
        System.out.println("=== Dados do Aluno ===");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Nota Final: " + aluno.getNotaFinal());
        System.out.println("Situação: " + (aluno.verificarAprovacao() ? "APROVADO" : "REPROVADO"));
        System.out.println();
        
        System.out.println("=== Dados do Professor ===");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("CPF: " + professor.getCpf());
        System.out.println("Disciplina: " + professor.getDisciplina());
        System.out.println("Carga Horária Semanal: " + professor.getCargaHoraria() + " horas");
        
        double valorHora = 50.0; // Valor da hora aula
        double salario = professor.calcularSalarioMensal(valorHora);
        System.out.println("Salário Mensal (valor hora R$ " + valorHora + "): R$ " + String.format("%.2f", salario));
        System.out.println();
        
        // Testando com diferentes valores
        System.out.println("=== TESTES ADICIONAIS ===");
        System.out.println();
        
        // Aluno reprovado
        Aluno aluno2 = new Aluno("Pedro Costa", "111.222.333-44", "2023002", 5.8);
        System.out.println("Aluno: " + aluno2.getNome());
        System.out.println("Nota: " + aluno2.getNotaFinal());
        System.out.println("Situação: " + (aluno2.verificarAprovacao() ? "APROVADO" : "REPROVADO"));
        System.out.println();
        
        // Professor com diferente valor hora
        Professor professor2 = new Professor("Carlos Oliveira", "555.666.777-88", "Física", 30);
        double valorHora2 = 65.0;
        double salario2 = professor2.calcularSalarioMensal(valorHora2);
        System.out.println("Professor: " + professor2.getNome());
        System.out.println("Disciplina: " + professor2.getDisciplina());
        System.out.println("Carga Horária: " + professor2.getCargaHoraria() + " horas");
        System.out.println("Salário Mensal (valor hora R$ " + valorHora2 + "): R$ " + String.format("%.2f", salario2));
    }
}