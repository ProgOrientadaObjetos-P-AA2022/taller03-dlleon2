/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete_Dos;

import paquete_Uno.Equipo_Celular;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ejecutar {
        
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Equipo_Celular cs = new Equipo_Celular();
        
        //valores
        String sistemaOperativo;
        String tamañoPantalla;
        String direccionMac;
        String informacionIMEI;
        double ivaCostoInicial = 0;
        double costoInicial;
        double iva;
        double costoFinal;
        
        System.out.println("--Ingrese la informacion del producto--");
        
        System.out.println("-----------------------------------");
        System.out.println("Ingrese la Informacion IMEI");
        informacionIMEI = leer.nextLine();
        
        System.out.println("----------------------------------");
        System.out.println("ingrese la direccion Mac");
        direccionMac = leer.nextLine();
        
        System.out.println("----------------------------------");
        
        System.out.println("Ingrese el sistema operativo");
        sistemaOperativo = leer.nextLine();
        
        System.out.println("----------------------------------");
        
        System.out.println("Ingrese el tamaño de la pantalla");
        tamañoPantalla = leer.nextLine();
        
        System.out.println("----------------------------------");
        
        System.out.println("Ingrese el costo inicial");
        costoInicial = leer.nextDouble();
        
        System.out.println("----------------------------------");
        
        System.out.println("Ingrese el iva ");
        iva = leer.nextDouble();
            
        cs.establecer_sistemaOperativo(sistemaOperativo);
        cs.establecer_tamañoPantalla(tamañoPantalla);
        cs.establecer_costoInicial(costoInicial);
        cs.establecer_iva(iva);
        cs.establecer_ivaCostoInicial(iva * costoInicial);
        cs.establecer_direccionMac(direccionMac);
        cs.establecer_informacionIMEI(informacionIMEI);
        cs.establecer_costoFinal(costoInicial + ivaCostoInicial);
        
        System.out.printf("\n---COSTO TOTAL---\n"
                + "informacio IMEI: %s\nSistema Operativo: %s\n"
                + "DireccionMac: %s\nTamaño de la Pantalla: %s\n"
                + "Costo Inicial: %.2f\n iva : %.2f\nIva del costo Inicial: %.2f\n"
                + " Costo Final %.2f\n",cs.obtener_informacionIMEI(),
                cs.obtener_sistemaOperativo(),cs.obtener_direccionMac(),
                cs.obtener_tamañoPantalla(),cs.obtener_costoInicial(),iva,
                cs.obtener_ivaCostoInicial(),cs.obtener_costoFinal());
        
}
}
