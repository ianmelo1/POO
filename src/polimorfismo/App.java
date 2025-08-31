package polimorfismo;


public class App {
    public static void main(String[] args){
        Pessoas m2 = new Medico("Ana", 25,  "12345-DF", "Cardiologia");


        m2.cumprimentar();
        ((Pessoas)m2).cumprimentar();
        ((Medico)m2).atender("Joao", "14hrs");


        Medico m3 = (Medico)m2;
        m3.atender("carlos", "18hrs");


        Pessoas p1 = new Pessoas("Mario", 50);
        p1.cumprimentar();
    }
}
