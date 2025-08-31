package Figuras;

public class Circulo extends Forma2D {
    private double raio;

    public Circulo(double raio) {
        super("Círculo");
        if (raio <= 0) {
            throw new IllegalArgumentException("Raio deve ser > 0.");
        }
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public void descricao() {
        System.out.println("Forma: " + obterNome());
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + area());
        System.out.println("Perímetro: " + perimetro());
        System.out.println("---------------------------");
    }
}
