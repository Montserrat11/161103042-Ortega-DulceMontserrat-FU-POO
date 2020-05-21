
import java.util Scanner;
public class CuboNumero {
   public static void main (String[]args){
       Scanner Sca=new Scanner (System.in);
       
       System.out.println("Ingresa un numero para elevarlo");
       
       int cubo= Sca nexInt();
       
       int resultado=cubo*cubo*cubo;
       System.out.println("El numero elevado al cubo es:"+resultado);
   } 
}
