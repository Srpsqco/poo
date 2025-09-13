public class Pedido {
    private String numero;
    private String data;
    private double valorTotal;
    
    public Pedido() {
        this.numero = "";
        this.data = "";
        this.valorTotal = 0.0;
    }
    
    public Pedido(String numero, String data) {
        this.numero = numero;
        this.data = data;
        this.valorTotal = 0.0;
    }
    
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public double getValorTotal() {
        return valorTotal;
    }
    
    public void adicionarProduto(Produto produto, int quantidade) {
        if (produto != null && quantidade > 0) {
            double valorItem = produto.getPrecoUnitario() * quantidade;
            valorTotal += valorItem;
            System.out.println("Adicionado: " + quantidade + "x " + produto.getNome() + 
                             " - R$ " + produto.getPrecoUnitario() + " cada = R$ " + valorItem);
        }
    }
}

