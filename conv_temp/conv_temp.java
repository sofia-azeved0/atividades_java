import java.util.Scanner;

public class conv_temp {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double celsius, fahrenheit;
        System.out.println("Coversor de temperatura de Celsius para Farenheit");
        System.out.println("Digite a temperatura em Celsius: ");
        celsius = input.nextDouble();
        fahrenheit = (celsius * 9/5) + 32;
        System.out.println ("A temperatura em Fahrenheit é: " + fahrenheit + "°F");

    input.close();
    }  
}