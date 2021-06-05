import java.util.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String tex1;
        String tex2;

        System.out.println("Ingrese el texto: ");
        tex1 = leer.nextLine();

        System.out.println("Ingrese la letra a buscar: ");
        tex2 = leer.nextLine();
        leer.close();

        int cantveces = tex1.length() - tex1.replace(tex2, "").length();
        System.out.println("cantidad de veces que aparece la letra: " + cantveces);

    }
}
