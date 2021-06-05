import java.util.*;

public class Ejercicio7{ 

    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        String tex1;
        
        System.out.printf("Ingrese caracter en minúscula: ");
        tex1 = leer.nextLine();
        leer.close();

        int longuitud = tex1.length();
        String res = "";

        for (int i = 0; i < longuitud; i++) { 
        char c = tex1.charAt(i);
         c = (char)(c - (int) 'a' + (int) 'A');

        String conversion = String.valueOf(c);
        res = res.concat(conversion);
        }

        System.out.println(res);
        
    }

}
