public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899, 29.90);
        Livro livro2 = new Livro();
        
        livro2.setTitulo("O Cortiço");
        livro2.setAutor("Aluísio Azevedo");
        livro2.setAnoPublicacao(1890);
        livro2.setPreco(25.50);
        
        System.out.println("=== Livro 1 ===");
        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Ano: " + livro1.getAnoPublicacao());
        System.out.println("Preço: R$ " + livro1.getPreco());
        System.out.println();
        
        System.out.println("=== Livro 2 ===");
        System.out.println("Título: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Ano: " + livro2.getAnoPublicacao());
        System.out.println("Preço: R$ " + livro2.getPreco());
    }
}
