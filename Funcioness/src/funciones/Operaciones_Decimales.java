package funciones;

/**
 * @archivo Oprecaciones_Decimales.java
 * @autor Antonio
 * @clase Fundamentos de Programacion
 * @Ciclo 2025-1
 * @Fecha 
 */
public class Operaciones_Decimales {
    
    public static void Operaciones(){
        int resultado_suma;        
        int primerSumando = 6;        
        int segundoSumando = 8;        
        resultado_suma = Operaciones.sumaDeDecimales(primerSumando, segundoSumando);        
        System.out.println("El resultado de la suma de 3 mas 2 es " + resultado_suma);
        
        int primer_numero_resta = 8;
        int segundo_numero_resta = 3;
        int resultado_resta = Operaciones.restaDeDecimales(primer_numero_resta, segundo_numero_resta);
        System.out.println("El resultado de la resta de 10 - 7 es " + resultado_resta);
        
        int primer_numero_multiplicacion = 5;
        int segundo_numero_multiplicacion = 5;
        int resultado_multiplicacion = Operaciones.multiplicacionDeDecimales(primer_numero_multiplicacion,segundo_numero_multiplicacion);
        System.out.println("El resultado de multipliar 25 por 3 es " + resultado_multiplicacion);
             
        int primer_numero_division = 100;
        int segundo_numero_division= 0;
        Double resultado_division = Operaciones.divisionDeDecimales(primer_numero_division, segundo_numero_division);
        
        if(resultado_division != null){
            System.out.println("El resultado de dividir 100 entre " + segundo_numero_division + " es " + resultado_division);
        }
    }
}
