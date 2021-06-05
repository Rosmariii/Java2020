import java.util.Scanner;

 public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        System.out.println("ingrese el primer numero: ");
        num1 = leer.nextInt();

        System.out.println("ingrese el segundo numero: ");
        num2 = leer.nextInt();
        
        int res1 = num1+num2;
        int res2 = num1-num2;
        int res3 = num1/num2;
        int res4 = num1*num2;
        int res5 = num1%num2;

        System.out.println("el resultado es:");
        System.out.println(num1 + "+" +  num2 + "=" + res1);
        System.out.println(num1 + "+" +  num2 + "=" + res2);
        System.out.println(num1 + "+" +  num2 + "=" + res3);
        System.out.println(num1 + "+" +  num2 + "=" + res4);
        System.out.println(num1 + "+" +  num2 + "=" + res5);

        leer.close();
    }
 }