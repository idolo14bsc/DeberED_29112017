package ec.edu.ister.modelo;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * Nombre: Cristian Calle
 */
public class Numeros {
    public static void elementos(){
        Scanner entrada = new Scanner(System.in);
        int elementos,suma=0;
        int promedio=0;
        elementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros : "));
        int[] numeros = new int[elementos];
        
               
        for(int i=0;i<elementos;i++) {
            
            System.out.println((i+1)+"Numero: ");
            
            numeros[i] = entrada.nextInt();
            suma = suma+numeros[i];
            promedio = suma/elementos;
        }
        
        System.out.println("Los numeros ingresados fueron: ");
        
        for(int i=0;i<elementos;i++) {
            System.out.println(numeros[i]);
           
          
        }
        System.out.println("La suma de los Numeros Ingresados es: "+suma);
        System.out.println("El Promedio de los Numeros Ingresados es: "+promedio);
        
        
        
        
        
         
        
    }
    
    
    }
    
    
    
    
   
    
    
    


