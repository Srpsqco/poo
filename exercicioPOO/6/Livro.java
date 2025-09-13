public class Livro extends Publicacao {
    private String autor;
    
    public Livro() {
        super();
        this.autor = "";
    }
    
    public Livro(String titulo, int ano, String autor) {
        super(titulo, ano);
        this.autor = autor;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Autor: " + autor);
        System.out.println("Tipo: Livro");
        System.out.println("------------------------");
    }
}

