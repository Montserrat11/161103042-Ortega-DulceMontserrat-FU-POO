import java.util.Scanner;
public class PiramideAsteriscos {
    
    public static void main(String[] args){
        Scanner piramide = new Scanner(System.in);
        System.out.println("ingresa la cantidad de filas:");
        int filas=piramide.nextInt();
        piramide.close();
        
        System.out.println();
        for (int alto = 1; alto < filas; alto++){
            
            for (int espacio = 1; espacio < filas; espacio++){
                System.out.print("");
            }
            for (int asteriscos = 1; asteriscos <=(alto*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
    
}
}