import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("ingrese el primer numero: ");
        num1 = leer.nextInt();

        System.out.println("ingrese el segundo numero: ");
        num2 = leer.nextInt();
        leer.close();

        int flag = 1;

        for(int i = 0; i<num2; i++){
            flag = flag * num1;
        } 
        System.out.println(num1 + " elevado a la " + num2 + " = " + flag);
    }
}
