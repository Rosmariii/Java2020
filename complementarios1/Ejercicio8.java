import java.util.*;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String tex1;
        int tex2;
        String tex3;
        String tex4;

        System.out.println("ingrese nombre y apellido: ");
        tex1 = leer.nextLine();

        System.out.println("ingrese edad: ");
        tex2 = leer.nextInt();

        System.out.println("ingrese direccion: ");
        tex3 = leer.nextLine();

        System.out.println("ingrese ciudad: ");
        tex4 = leer.nextLine();
        leer.close();

        System.out.println("Datos:");
        System.out.println(tex4 + " - " + tex3 + " - " + tex2 + " - " + tex1);
    
    }
}
