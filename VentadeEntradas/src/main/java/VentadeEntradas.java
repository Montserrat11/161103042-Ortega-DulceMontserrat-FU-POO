/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author orma_
 */
import java.util.*;
public class VentadeEntradas {
    
    public static void main(String[]args){
        float Bo1a,Bolb,Bolc,Bold;
        float totalA,totalB,totalC,totalD;
        
        Scanner scan =new Scanner(System.in);
        System.out.print("Numero de boletos de la tribuna a");
        Bola = scan.nextInt();
        totalA=Bola*2760;
        System.out.println("Numero de boletos de la tribuna b");
        Bolb = scan.nextInt();
        totalB=Bolb*1200;
        System.out.println("Numero de boletos de la tribuna c");
        Bolc = scan.nextInt();
        totalC=Bolc*740;
        System.out.println("Numero de boletos para la tribuna d");
        Bold = scan.nextInt();
        totalD=Bold*430;
        
        System.out.println("El precio total a pagar por cada tribuna es:");
        System.out.println("Precio total tribuna a: $"+totalA);
        System.out.println("Precio total tribuna b: $"+totalB);
        System.out.println("Precio total tribuna c: $"+totalC);
        System.out.println("Precio total tribuna d: $"+totalD);
    }
    
}
