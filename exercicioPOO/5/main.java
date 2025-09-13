public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 3);
        Gato gato = new Gato("Mimi", 2);
        
        System.out.println("=== Dados do Cachorro ===");
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Idade: " + cachorro.getIdade() + " anos");
        cachorro.latir();
        System.out.println();
        
        System.out.println("=== Dados do Gato ===");
        System.out.println("Nome: " + gato.getNome());
        System.out.println("Idade: " + gato.getIdade() + " anos");
        gato.miar();
    }
}