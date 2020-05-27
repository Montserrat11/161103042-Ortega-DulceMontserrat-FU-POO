import java.util.Scanner;
public class PiramideNumeros {
    public static void main(String[] args){
        
        Scanner lector = new Scanner(System.in);
        
        while(true){
          
           System.out.println("Ingresa un numero");
           int n = lector.nextInt();
           
           if(n>0){
               
               for(int i=1;i<=n;i++){
                   
                   System.out.println("");
                   for(int j=1;j<=i;j++){
                       System.out.print(j+"");
                   }
               }
           }
           
           else{
               System.out.println("El numero que ingresó no es correcto"
                        + "Intentelo de nuevo");
               
           }
    }
    }
}
