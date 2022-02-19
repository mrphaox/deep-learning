import java.util.Scanner;
public class front {
    static Scanner tec = new Scanner(System.in);
    public static void main(String[] args) {
        int Cuenta, montoRetiro,all;
        System.out.println("cual es el monto total de la cueta");
        Cuenta = tec.nextInt();
        System.out.println("cual es costo a retirar");
        montoRetiro = tec.nextInt();
        retiro(montoRetiro, Cuenta);
    }
    // front 
//************************************************************** */
        //uwu
//***************************************************************** */
    /// o-o back
    public static  int cuenta(int a) {
        return a;
    }
     public static int retiro(int a , int b ) {
        int acumulado;
        if (a>b) {
             acumulado = a;
        System.out.println("retiro de la cueta exede en lo que tiene en la cuenta"+ acumulado);
         return acumulado;
    } else {
           //  int acumulado;
            acumulado = a-b;
      System.out.println("retiro de la cuenta exitoso saldo "+acumulado);  
    return acumulado;
    }
     }
}
