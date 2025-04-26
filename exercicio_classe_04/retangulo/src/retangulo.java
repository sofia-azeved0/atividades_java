public class retangulo {

    double largura;
    double altura;
    double area;
    double perimetro;

    public retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public void calcularArea() {
        this.area = largura * altura;
    }
    public void calcularPerimetro () {
        this.perimetro = 2 * (largura + altura);
    }
    public void exibirArea() {
        System.out.println("A área do retângulo é: " + area);
    }
    public void exibirPerimetro() {
        System.out.println("O perímetro do retângulo é: " + perimetro);
    }
}
