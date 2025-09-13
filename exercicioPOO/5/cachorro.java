public class Cachorro extends Animal {
    
    public Cachorro() {
        super();
    }
    
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    
    public void latir() {
        System.out.println(getNome() + " diz: Au Au!");
    }
}
