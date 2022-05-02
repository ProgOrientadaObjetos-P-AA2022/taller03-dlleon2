/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_Dos;

import Paquete_Uno.InstitucionEducativa;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ejecutar {
    public static void main(String[] args) {
        // Crear un objeto de tipo educativo
        Scanner leer = new Scanner(System.in);
        InstitucionEducativa ed = new InstitucionEducativa();
        
        //valores
        String nombre;
        String tipodeinstitucion;
        int numerodealumnos;
        int numerodedocentes;
        int numerodesedes;
        double gastosporestudiante;
        double presupuesto = 0;
        
        System.out.println("--DATOS DE LA INSTUTICION EDUCATIVA--");
        
        System.out.println("Ingrese el nombre la Institucion Educativa");
        nombre = leer.nextLine();
        
        System.out.println("Ingrese el tipo de Institucion Educativa");
        tipodeinstitucion = leer.nextLine();
        
        System.out.println("Ingrese el número de alumnos de la Institucion Educativa");
        numerodealumnos = leer.nextInt();
        
        System.out.println("Ingrese el número de docentes de la Institucion Educativa");
        numerodedocentes = leer.nextInt();
        
        System.out.println("Ingrese el número de sedes de la Institucion Educativa");
        numerodesedes = leer.nextInt();
        
        System.out.println("Ingrese los gastos proyectados por estudiante");
        gastosporestudiante = leer.nextInt();
        
        ed.establecernombre(nombre);
        ed.establecertipo_de_institucion(tipodeinstitucion);
        ed.establecernumero_de_alumnos(numerodealumnos);
        ed.establecernumero_de_docentes(numerodedocentes);
        ed.establecernumero_de_sedes(numerodesedes);
        ed.establecergastos_por_estudiante(gastosporestudiante );
        ed.establecerpresupuesto(numerodealumnos * gastosporestudiante);
        
        ed.obtenerpresupuesto();
        
        System.out.printf("\n---PRESUPUESTO---\nNombre la Institucion "
                + "Educativa: %s\nTipo de Institucion Educativa %s\n"
                + "Número de alumnos: %d\nNúmero de docentes: %d\n"
                + "Número de sedes: %d\ngastos proyectados por estudiante: %.2f\n"
                + "Presupuesto %.2f",
                ed.obtenernombre(),ed.obtenertipo_de_institucion(),
                ed.obtenernumero_de_alumnos(),ed.obtenernumero_de_docentes(),
                ed.obtenernumero_de_sedes(),ed.obtenergastos_por_estudiante(),
                ed.obtenerpresupuesto());
    }
}        

