
import java.util.Scanner;
public class ValorAbsoluto {
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[]args){
        
        int numero;
        System.out.println("Teclea un numero:");
        numero = entrada.nextInt();
        
        if(numero < 0)
            System.out.println("El numero es:" + numero + "y su valor es:" + Math.abs(numero));
        else 
            System.out.println("El numero es:" +  numero);
    }
}
