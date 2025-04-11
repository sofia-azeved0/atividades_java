import java.util.Scanner;

public class tabuada {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in); 
      int num;
   
      System.out.println("Tabuada de Multiplicação!");
      System.out.println("Olá, escolha qual tabuada você deseja. A tabuada pode ser de 1 a 10.");
      num = input.nextInt();

      if (num < 1 || num > 10) {
          System.out.println("Número inválido! Escolha um número entre 1 e 10.");
      } else {
          System.out.println("Tabuada do " + num + ":");
          for (int i = 1; i <= 10; i++) {
              System.out.println(num + " x " + i + " = " + (num * i));
          }
      }

      input.close(); 
      
   }
}
