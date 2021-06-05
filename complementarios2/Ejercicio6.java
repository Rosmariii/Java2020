
import java.util.*;
import java.util.HashMap;


public class Ejercicio6 {
    
    
    String nombreYApellido;
    int DNI;
    int horasTrabajadas;  
    static int valorPorHoras;
    static int Salario;
    static Map<Integer, Integer> DNISalario = new HashMap<>() ;
    
    
    Ejercicio6(String nombreYApellido, int DNI, int horastrabajadas, int valorPorHoras){
        this.nombreYApellido = nombreYApellido;
        this.DNI = DNI;  
        this.horasTrabajadas = horastrabajadas;
        Ejercicio6.valorPorHoras = valorPorHoras;
    }
    public static void main(String[] args) {
        
        Ejercicio6 personal1 = new Ejercicio6("Ginés García", 43345543, 30, 23000);
        Ejercicio6 personal2 = new Ejercicio6("Carla Vizzotti", 45098890, 20, 15000);
        Ejercicio6 personal3 = new Ejercicio6("Santiago Cafiero", 38093345, 28, 20000 );
        Ejercicio6 personal4 = new Ejercicio6("Victoria Donda", 36342213, 20, 16000 );
        


        HashSet<Ejercicio6> personal = new HashSet<Ejercicio6>();
        personal.add(personal1);
        personal.add(personal2);
        personal.add(personal3);
        personal.add(personal4);
        
        for(Ejercicio6 i : personal){ 
        Integer DNI = i.DNI;
        Integer Salario = i.horasTrabajadas*valorPorHoras;
        DNISalario.put(DNI, Salario);
        }
    System.out.println(DNISalario);
        
    }  

}
    