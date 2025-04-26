public class circulo {
    double raio;
    double area;
    double circunferencia;

    public circulo(double raio) {
        this.raio = raio;
    }
    public void calcularArea() {
        area = Math.PI * Math.pow(this.raio, 2);
    }
    public void calcularCircunferencia() {
        circunferencia = 2 * Math.PI * this.raio;
    }
    public void exibirArea() {
        System.out.println("Área: " + area);
    }
    public void exibirCircunferencia() {
        System.out.println("Circunferência: " + circunferencia);
    }
}
