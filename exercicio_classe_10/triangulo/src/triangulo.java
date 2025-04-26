public class triangulo {
    private double base;
    private double altura;
    private double area;

    public triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.area = calcularArea();
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }



    public void exibirArea() {
        System.out.println("Area do triângulo: " + area);
    }
}
