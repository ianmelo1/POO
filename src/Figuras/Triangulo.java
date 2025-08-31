package Figuras;

public class Triangulo extends Forma2D {
    private double lado1, lado2, lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        super(determinarNome(lado1, lado2, lado3));

        if (!(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1)) {
            throw new IllegalArgumentException(
                    "Os três lados informados não formam um triângulo. " +
                            "A soma de dois lados deve ser maior que o terceiro."
            );
        }

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    private static String determinarNome(double l1, double l2, double l3) {
        if (l1 == l2 && l2 == l3) return "Triângulo Equilátero";
        if (l1 == l2 || l1 == l3 || l2 == l3) return "Triângulo Isósceles";
        return "Triângulo Escaleno";
    }

    @Override
    public double area() {
        double s = perimetro() / 2.0;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public double perimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public void descricao() {
        System.out.println("Forma: " + obterNome());
        System.out.println("Lados: " + lado1 + ", " + lado2 + ", " + lado3);
        System.out.println("Área: " + area());
        System.out.println("Perímetro: " + perimetro());
        System.out.println("---------------------------");
    }
}
