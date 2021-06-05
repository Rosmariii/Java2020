import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1 = 0;

        System.out.println("ingrese un numero: ");
        num1 = leer.nextInt();
        leer.close();
        
        int flag = 1;

        while (flag <= num1) {  
            
            System.out.println(flag);
            flag++;       
        } 

    }
    
}
