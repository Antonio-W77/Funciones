package funciones;
import java.util.Scanner;
/**
 * @archivo Funciones.java
 * @autor Antonio
 * @clase Fundamentos de Programacion
 * @Ciclo 2025-1
 * @Fecha 05/Octubre/2024
 */
public class Funciones {
    public static void main(String[] arg) {
        System.out.println("Hola mundo cruel");
        
        Scanner A=new Scanner(System.in);
        Operaciones T=new Operaciones();
        
        double n1=7;
        double n2=5;
        double r;
         
        r=T.sumaDeDecimal(n1, n2);
        System.out.println("La suma de DECIMAL es: "+r);
        
        r=T.restaDedecimal(n1, n2);
        System.out.println("La resta de DECIMAL es: "+r);
        
        r=T.multiDedecimal(n1, n2);
        System.out.println("La multiplicacion de DECIMAL es: "+r);
        
        r=T.diviDeDecimal(n1, n2);
        System.out.println("La division de DECIMAL es: "+r);
    }
}
    
    //////////////////////////////////
    
    //System.out.println("Resultado de suma: " +sumaDeEnteros);
    //System.out.println("Resultado de resta: "+restaDeEnteros);
    //System.out.println("Resultado de multiplicacion: " +multiplicacionDeEnteros);
    //System.out.println("Resultado de divicion: " +divicionDeEnteros);