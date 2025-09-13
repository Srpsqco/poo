public class Main {
    public static void main(String[] args) {
        // Criando objetos de Livro e Revista
        Livro livro1 = new Livro("Dom Casmurro", 1899, "Machado de Assis");
        Livro livro2 = new Livro("O Cortiço", 1890, "Aluísio Azevedo");
        Revista revista1 = new Revista("Veja", 2024, "Edição 1234");
        Revista revista2 = new Revista("Época", 2024, "Edição 567");
        
        // Armazenando em um array de Publicacao
        Publicacao[] biblioteca = new Publicacao[4];
        biblioteca[0] = livro1;
        biblioteca[1] = livro2;
        biblioteca[2] = revista1;
        biblioteca[3] = revista2;
        
        System.out.println("=== SISTEMA DE BIBLIOTECA ===");
        System.out.println();
        
        // Percorrendo o array e exibindo informações
        for (int i = 0; i < biblioteca.length; i++) {
            System.out.println("Item " + (i + 1) + ":");
            biblioteca[i].exibirInformacoes();
        }
    }
}
