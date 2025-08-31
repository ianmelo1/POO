package polimorfismo;


public class Pessoas {
    private String nome;
    private int idade;


    Pessoas(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }


    public void cumprimentar(){
        System.out.println("Olá meu nome é " + nome + ", minha idade é " + idade);
    }


    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }


}
