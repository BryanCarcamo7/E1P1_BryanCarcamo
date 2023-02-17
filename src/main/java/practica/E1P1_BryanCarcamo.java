/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Bryan Carcamo
 */
public class E1P1_BryanCarcamo {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in).useDelimiter("\n");
        
         
        int opcion=0;
        while(opcion!=4){
        System.out.println("---------MENU--------");
        System.out.println("1.Numero Valido ");
        System.out.println("2.Reordenado de cadenas ");
        System.out.println("3.Trigonometria ");
        System.out.println("4.Salir ");
        System.out.println("Opcion: ");
       opcion=lea.nextInt();
       
        switch(opcion){
            case 1:
                System.out.println("Ingrese el numero: ");
                String cad=lea.next();
                
                System.out.println("");
                
             for(int i=0;i<cad.length();i++){
             char valid=cad.charAt(i);
             
             if(cad.startsWith("-")){
                 System.out.println(cad+ "El numero es valido");
             }
             else if(cad.startsWith(".") || cad.contains("."+i/2) || cad.endsWith(".")){
                 System.out.println(cad+" Es un numero valido");
             }
             
             else if(cad.charAt(1)=='-'){
                 System.out.println(cad+" No es un numero valido");
             }
             else{
                 System.out.println(cad+" Es un numero valido");
             }
             }
                
                
                
                break;
                
            case 2:
                System.out.println("Ingrese la cadena: ");
               String cadena=lea.next();
                
              char[] chars=cadena.toCharArray();
                  Arrays.sort(chars);
                 cadena=new String(chars);
                 
                 System.out.println(cadena);
                  
                
                
                break;
                
            case 3:
                System.out.println("Ingrese el angulo (grados) que desea calcular: ");
                double angulo=lea.nextDouble();
                
                System.out.println("Ingrese la precision que desea ingresar: ");
                int precision=lea.nextInt();
                
                double radianes=(angulo*Math.PI)/180;
                
                double grados=0;
                      
                for(int i=0;i+1<=precision;i++){
                
               double nominador=Math.pow(-1, i) * Math.pow(radianes, 2*i+1);
               double denominador=2*i+1;
                
                grados=grados+(nominador/denominador);
                
                }
                System.out.println("sin("+radianes+"): "+grados);
                
                break;
                
            case 4:
                System.out.println("Feliz dia");
               break;
        }
        
        }
    }
   
}
