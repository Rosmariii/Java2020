import java.util.*;

public class ejercicio3 {

    public static void main(String[] args) {
        
    
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for(int i=1; i <= 10 ;i++){
            lista.add(i);
        }
        System.out.println("Lista en orden: " + lista);

        Collections.reverse(lista);
        System.out.println("Lista a la inversa: " + lista);

        Collections.shuffle(lista);
        System.out.println("Lista desordenada: " + lista);

    }
}
