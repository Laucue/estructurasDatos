
package com.mycompany.ejercicio_arreglo;
import java.util.Scanner;
public class Ejercicio_Arreglo {

    public static void main(String[] args) {
        //instanciar:
        Scanner multipli = new Scanner(System.in);
        //asignamos variables
        int suma = 0;
        int multiplicacion;
        //inicializamos el arreglo
        int arregloA [] = new int [10];
        int arregloB [] = new int [10];
        
        System.out.println("VECTOR A: ");
        for (int i = 0;i<10;i++){

            System.out.println("Ingrese el numero "+(i+1)+" :");
            
            arregloA[i] = multipli.nextInt();
        }
        
        System.out.println("VECTOR B: ");
        for (int i = 0;i<10;i++){
            
            System.out.println("Ingrese el numero "+(i+1)+" :");
           
            arregloB[i] = multipli.nextInt();
        }
        for (int i = 0; i<10;i++){
            
            multiplicacion = (arregloA[i]*arregloB[i]);
            suma = suma + multiplicacion;
            
        }
        System.out.println("La suma de la multiplicación es: "+suma); 
    }
}
