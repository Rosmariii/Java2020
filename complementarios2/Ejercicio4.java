import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<String>();
        String nombres;
        int flag = 1;

        while (lista.size() < 12 ) {
            System.out.println("Escribir el nombre del alumno numero " + flag);
            nombres = leer.nextLine();
            lista.add(nombres);
            flag++;
        }
        leer.close();

        List<String> clase1 = lista.subList(0, 4);
        List<String> clase2 = lista.subList(4, 8);
        List<String> clase3 = lista.subList(8, 12);

        System.out.println("La clase uno la integran: " + clase1 + "\nLa clase dos esta integrada por: " + clase2  + "\nY la clase tres esta integrada por: " + clase3);

    }
    
}
