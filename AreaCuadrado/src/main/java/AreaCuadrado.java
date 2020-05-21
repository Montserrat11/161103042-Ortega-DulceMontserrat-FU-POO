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
import java.util.Scanner;
public class AreaCuadrado {
   public static void main (String[]args){
       Scanner leer=new Scanner(System.in);
       System.out.println("area del cuadrado");
       double a=0;
       System.out.println("Introduce la medida de un lado");
       a=leer.nextDouble();
       double resultado=(l*l);
       System.out.println("El area es:"+resultado);
   }    
}
