/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author orma_
 */
public class CalcularRaices {
    public static void main(String args[];{
      Scanner sc = new Scanner(System.in);
      double a,b,c;
      double R1,R2;
      
      
      System.out.println("Valor a:*");
      a = sc.nextDouble();
      System.out.println("Valor b:");
      b = sc.nextDouble();
      System.out.println("Valor c:");
      c = sc.nextDouble();
      
      double numero = (b*b) - (4*a*c);
      if(numero >0){
          R1 = (-b + Math.sqrt(numero)) / 2*a;
          R2 = (-b - Math.sqrt(numero))  / 2*a;
          System.out.println("La escuacion tiene dos soluciones");
          System.out.println("R1:" +R1);
          System.out.println("R2:" +R2);
      }else{
          if (numero == 0){
              R1 = (-b) / 2*a;
              System.out.println("LA ecuacion tiene una solucion");
              System.out.println("R1:"  +R1);
              
          }else {
              System.out.println("La ecuacion no tiene solucion");
          }
      }
      
}
    
    
    
}
