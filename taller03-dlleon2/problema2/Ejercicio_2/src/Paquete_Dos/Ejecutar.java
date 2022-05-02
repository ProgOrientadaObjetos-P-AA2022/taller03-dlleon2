/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_Dos;
import Paquete_Uno.EquivalenteHora;
import java.util.Scanner;

/**
 * @author LENOVO
 */
public class Ejecutar {
    public static void main(String[] args) {
        
        // Crear un objeto de tipo convercion de horas
        Scanner leer = new Scanner(System.in);
        EquivalenteHora cl = new EquivalenteHora ();
        
        //Valores
        double hora;
        double minutos = 60;
        double segundos = 3600;
        double dias = 24;
        
        System.out.println("---DATOS PARA LA CONVERCION---");
        //Imprencion en pantalla
        System.out.println("Ingrese el numero de horas a convertirce");
        hora = leer.nextDouble();
        
        cl.establecerhoras(hora);
        cl.establecerminutos(minutos);
        cl.establecersegundos(segundos);
        cl.establecerdias(dias);
        
        System.out.printf("\n---convercion de las Horas---\nHoras a convertir: %.2f\n"
                + "Horas en minutos: %.2f\nHoras en Segundos: %.2f\n"
                + "Horas en días: %.2f\n",cl.obtenerhoras(),cl.obtenerminutos(),
                cl.obtenersegundos(),cl.obtenerdias());
    }
}
