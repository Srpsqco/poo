public class Gato extends Animal {
    
    public Gato() {
        super();
    }
    
    public Gato(String nome, int idade) {
        super(nome, idade);
    }
    
    public void miar() {
        System.out.println(getNome() + " diz: Miau!");
    }
}
