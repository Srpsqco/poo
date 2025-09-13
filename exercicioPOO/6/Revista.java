public class Revista extends Publicacao {
    private String edicao;
    
    public Revista() {
        super();
        this.edicao = "";
    }
    
    public Revista(String titulo, int ano, String edicao) {
        super(titulo, ano);
        this.edicao = edicao;
    }
    
    public String getEdicao() {
        return edicao;
    }
    
    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Edição: " + edicao);
        System.out.println("Tipo: Revista");
        System.out.println("------------------------");
    }
}
