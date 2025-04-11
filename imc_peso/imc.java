import java.util.*;

public class imc {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double peso, altura, imc;

        System.out.println("Informe o seu peso: ");
        peso = input.nextDouble();

        System.out.println("Informe a sua altura: ");
        altura = input.nextDouble();

        imc = peso / (altura * altura);
        System.out.println("O seu IMC é: " + imc);

        if (imc >= 40) {
            System.out.println("Obesidade grave.");
        } else if (imc >= 30) {
            System.out.println("Obesidade");
        } else if (imc >= 25) {
            System.out.println("Sobrepeso");
        } else if (imc >= 18.5) {
            System.out.println("Normal");
        } else {
            System.out.println("Magreza");
        }
    }
}
