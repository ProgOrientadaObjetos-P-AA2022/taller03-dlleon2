/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_uno;


import ejercicio_Dos.Terreno;
import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Terreno tr = new Terreno();
        
        //Valores 
        double anchoTerreno;
        double largoTerreno;
        double areaTerreno = 0;
        double valorMetroCuadrado = 1272;
        double costoTerreno;
        
        System.out.println("----DATOS PARA DETERMINAR EL COSTO DEL TERRENO----");
        
        //Impresion por pantalla
        
        System.out.println("Ingresar el ancho del terreno");
        anchoTerreno = leer.nextDouble();
        
        System.out.println("Ingresar el largo del terreno");
        largoTerreno = leer.nextDouble();
        /*
        System.out.println("Ingresar el valor por metro cuadrado");
        valormetrocuadrado = leer.nextDouble();
         */
        
        tr.establecerancho( anchoTerreno );
        tr.establecerlargo( largoTerreno );
        tr.establecervalormetrocuadrado(valorMetroCuadrado);
        tr.establecerarea(anchoTerreno * largoTerreno );
        tr.establecercosto_terreno(valorMetroCuadrado * areaTerreno );

        tr.obtenercosto_terreno();
        
        System.out.printf("\n---Costo de terreno---\nAncho del terreno: %.2f\n"
                + "Largo del terreno: %.2f\nArea del terreno: %.2f\nValor por metro cuadrado: %.2f\n"
                + "costo del terreno: %.2f\n", tr.obtenerancho(),
                tr.obtenerlargo(),tr.obtenerarea(),tr.obtenervalormetrocuadrado(),tr.obtenercosto_terreno()
                );
    }
    
    
}
