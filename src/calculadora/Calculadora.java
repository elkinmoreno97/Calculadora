/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author 10
 */

import java.util.Scanner;

        
public class Calculadora {
    
    
    
    public static void main(String[] args){
        
        int n1=0;
        int n2=0;
        int suma;
        int resta;
        int multiplicacion;
        int division;
        
        Scanner reader = new Scanner(System.in); 
        System.out.println("Ingrese el primer dato: ");
        n1 = reader.nextInt();
        System.out.println("Ingrese el segundo dato: ");
        n2 = reader.nextInt();
              
        suma = n1 + n2;
        System.out.println("La suma es: "+suma);
                
        resta = n1 - n2;
        System.out.println("La resta es: "+resta);
        
        multiplicacion = n1 * n2;
        System.out.println("La multiplicacion es: "+multiplicacion);
        
        division = n1 / n2;
        System.out.println("La division es: "+division);
        
    }
}
