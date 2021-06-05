import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int num1;
        int num2;
        int num3;
        
        while (lista.size() < 5 ) {
            System.out.println("Agregar el numero hasta cumplir los 5 lugares: ");
            num1 = leer.nextInt();
            lista.add(num1);
        }
        
        for (int i : lista) {
            System.out.println("el número ingresado es: " + i);
        }
        System.out.println("el tamaño de la lista es: " + lista.size());

        System.out.println("listo! ahora ingresa un número para agregarlo al principio: ");
        num2 = leer.nextInt();

        System.out.println("y un número al final");
        num3 = leer.nextInt();
        leer.close();
        
        lista.add(0, num2);
        lista.add(5, num3);
        System.out.println("La lista con numeros agregados al principio y al final es: " + lista);
        System.out.println("Ahora el tamaño es: " + lista.size());
            
    }
    
}
