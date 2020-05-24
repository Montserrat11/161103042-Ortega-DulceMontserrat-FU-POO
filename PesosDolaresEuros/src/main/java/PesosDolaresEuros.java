/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author orma_
 */
 
import java.util.Scanner;

public class PesosDolaresEuros {
    public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese el monto a convertir:");
    double dolares = teclado.nextDouble();
    double euros = teclado.nextDouble();
    System.out.println("Ingrese la tasa actual de cambio");
    double tasa = teclado.nextDouble();
    double PesosDolaresEuros = tasa * dolares;
    
    System.out.println(dolares +"pesos es igual a" + PesosDolaresEuros +"dolares");
    System.out.println(euros+"pesos es igual a" + PesosDolaresEuros +"euros");
}
    
   
}

