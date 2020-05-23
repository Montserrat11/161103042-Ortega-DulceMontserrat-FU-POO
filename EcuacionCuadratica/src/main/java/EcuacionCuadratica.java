/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author orma_
 */
import java.awt.*;
import java.util.Scanner;
import java.lang.Math;
public class EcuacionCuadratica {
    public static void main(String[]args){
        
      Scanner form=new Scanner(System.in);
      
      System.out.println("Ecuacion cuadratica");
      double a,b,c,x1,x2,potencia,raiz=0;
      System.out.println("Escribe el numero 1");
      
      a=form.nextDouble();
      
      System.out.println("Escribe el numerfo 2");
      b=form.nextDouble();
      
      System.out.println("Escribe el numero 3");
      c=form.nextDouble();
      
      potencia=Math.pow(b,2)-(4*a*c);
        x1=(-b-Math.sqrt(potencia)/2*a);
        x2=(-b+Math.sqrt(potencia)/2*a);
        
      System.out.println("nx1="+x1);
      System.out.println("nx2="+x2);
}
    
    
}
