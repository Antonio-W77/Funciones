package funciones;

/**
 *
 * @author Usuario
 */
public class Operaciones_Par_Impar {
    public static Par_Impar Par(int n1){
        boolean espar = n1/2!=0;
        
        ResultadoEntero r = new ResultadoEntero();
        
        boolean valor = espar;
        r.succes = true;
        
        return r;
    }
}
