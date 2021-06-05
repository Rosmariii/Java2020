import java.util.*;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        ArrayList<Integer> listaresultado = new ArrayList<Integer>();
        
        int honorarios;
        int horas;
        int flag = 1;
        int flag1 = 0;
        int total = 0;
        
        while (lista1.size() < 5 & lista2.size() < 5) {
            System.out.println("ingrese la carga horaria del dia " + flag);
            horas = leer.nextInt();
            lista1.add(horas);
        
            System.out.println("ingrese los honorarios del dia " + flag);
            honorarios = leer.nextInt();
            lista2.add(honorarios);
            flag++;
        }
        leer.close();
        while(flag1 < lista1.size()){ 
            Integer primero = lista1.get(flag1);
            Integer segundo = lista2.get(flag1);
            int calculo = primero * segundo;
            listaresultado.add(calculo);
            flag1++;
            }
        for (int i : listaresultado){
            total = total + i;
        }
        System.out.println("El precio por dia es: "+ listaresultado + "\nEl precio total es: " + total);
    }

    
}