import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1 = 0;
        System.out.println("ingrese el numero: ");
        num1 = leer.nextInt();
        leer.close();
        
        int i = 1;
        while ( num1!=0) {
            i= i*num1;
            num1--;
        }
    System.out.println(i);
    }    
}
