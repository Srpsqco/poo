public class Publicacao {
    private String titulo;
    private int ano;
    
    public Publicacao() {
        this.titulo = "";
        this.ano = 0;
    }
    
    public Publicacao(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + ano);
    }
}