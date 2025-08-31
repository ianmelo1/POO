package polimorfismo;


public class Medico extends Pessoas{
    private String crm;
    private String especialidade;


    Medico(String nome, int idade, String crm, String especialidade) {
        super(nome, idade);
        this.crm = crm;
        this.especialidade = especialidade;


    }
    @Override
    public void cumprimentar(){
        System.out.println("Olá meu nome é " + getNome() + ", minha idade é " + getIdade() + ", meu crm é: " + this.crm + ", e minha especialidade é em: " + this.especialidade + ".");
    }


    public void atender(){
        System.out.println("Atendendo paciente...");
    }


    public void atender(String nome){
        System.out.println("Atendendo paciente de nome: " + getNome());
    }


    public void atender(String nome, String horario){
        System.out.println("Atendendo paciente " + nome + " ás " + horario + ".");
    }
}
