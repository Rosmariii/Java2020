import java.util.*;

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<String>();
        String ciudades;

        while (lista.size() < 5 ) {
            System.out.println("Agregar tu ciudad: ");
            ciudades = leer.nextLine();
            lista.add(ciudades);
        }

        leer.close();

        for (int i = 0; i < lista.size(); i++){
            System.out.println("#" + i + " " + lista.get(i));
        }
        
    }

}