import java.util.Scanner;

public class maior_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner adicionado
        int num1, num2, num3;

        System.out.println("Digite um número:");
        num1 = input.nextInt();

        System.out.println("Digite um segundo número:");
        num2 = input.nextInt();

        System.out.println("Digite um terceiro número:");
        num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior número é: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("O maior número é: " + num3);
        } else if (num1 == num2 && num1 == num3) {
            System.out.println("Os três números são iguais: " + num1 + ", " + num2 + ", " + num3);
        } else if (num1 == num2 && num1 > num3) {
            System.out.println("Os números iguais e maiores são: " + num1 + " e " + num2);
        } else if (num1 == num3 && num1 > num2) {
            System.out.println("Os números iguais e maiores são: " + num1 + " e " + num3);
        } else if (num2 == num3 && num2 > num1) {
            System.out.println("Os números iguais e maiores são: " + num2 + " e " + num3);
        } else {
            System.out.println("Há dois números iguais, mas não são os maiores.");
        }

        input.close();
    }
}
