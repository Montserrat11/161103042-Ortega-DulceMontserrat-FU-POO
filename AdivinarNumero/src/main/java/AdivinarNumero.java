import java.util.*;
public class AdivinarNumero {
    public static Scanner entrada=new Scanner(System.in);
    public static void main(String[] args) {
         
		System.out.println("Instrucciones:");
                System.out.println("El programa elegira un numero del 1 al 10.");
               
		int numero=(int)(Math.random()*10);
 
		System.out.println("Indica un numero entre el 0 y el 10");
 
		int entrada=-1;
		int contador=0;
 
		do {
 			
			entrada=obtenerValor();
			if(entrada>numero) {
				System.out.println("El numero es menor");
			}else if(entrada<numero) {
				System.out.println("El numero es mayor");
			}
			contador++;
		} while(entrada!=numero);
 
		System.out.println("Haz adivinado el numero en " + contador + " intentos.");
	}
 
	public static int obtenerValor() {
		int valor=0;
 
		while(true){
			
				System.out.print("Indica el numero: ");
				valor=entrada.nextInt();
 
				
				if(valor<0 || valor>10) {
					System.out.println("El numero tiene que estar entre el 0 y el 10");
				}else{
					
					break;
				}			
		}
		return valor;
	}
    
}
