/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author orma_
 */
public class Casting {
    public static void main(String[]args){
       //casting explicito
       short a = 1;
       int b =15;
       a=(short)b;
       //casting implicito
       float c=4.5f;
       double d=5.6;
       d=c;
       //qué pasa con los decimales cuando casteo de flotante o double a entero?
       // R=el valor queda truncado
       
       double pi = 3.1416;
       int duda = (int) pi;
       System.out.println("duda es ="+duda);
       
       //casting String
       //Interger.parseInt
       String valor = "15";
       int n = Integer.parseInt(valor);
       
       n += duda;
       System.out.println(n);
       
       //Integer.valueOf
       String valor2 = "40";
       int m = Integer.valueOf(valor);
       System.out.println(n);
       
       //Ciclo for
       for (int i = 0; i < 10; i++);
           System.out.println()
    
    
}
