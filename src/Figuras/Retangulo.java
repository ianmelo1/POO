package Figuras;

public class Retangulo extends Forma2D {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        super(base == altura ? "Quadrado" : "Retângulo");
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Base e altura devem ser > 0.");
        }
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void descricao() {
        System.out.println("Forma: " + obterNome());
        System.out.println("Base: " + base + ", Altura: " + altura);
        System.out.println("Área: " + area());
        System.out.println("Perímetro: " + perimetro());
        System.out.println("---------------------------");
    }
}
