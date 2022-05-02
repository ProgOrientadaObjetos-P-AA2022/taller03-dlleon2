/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_Uno;

/**
 *
 * @author LENOVO
 */
public class InstitucionEducativa {
    private String nombre;
    private String tipodeinstitucion;
    private int numerodealumnos;
    private int numerodedocentes;
    private int numerodesedes;
    private double gastosporestudiante;
    private double presupuesto;
    
    public void establecernombre(String ed) {
        nombre = ed;
    }
    
    public void establecertipo_de_institucion(String ed) {
       tipodeinstitucion = ed;
    }
    
    public void establecernumero_de_alumnos(int ed) {
        numerodealumnos = ed;
    }
    
    public void establecernumero_de_docentes(int ed) {
        numerodedocentes = ed;
    }
    
    public void establecernumero_de_sedes(int ed) {
        numerodesedes = ed;
    }
    
    public void establecergastos_por_estudiante(double ed) {
        gastosporestudiante = ed;
    }
    
    public void establecerpresupuesto(double ed) {
        presupuesto = gastosporestudiante * numerodealumnos;
    }
    
    public String obtenernombre(){
        return nombre;
    }
     
    public String obtenertipo_de_institucion(){
        return tipodeinstitucion;
    }
     
    public int obtenernumero_de_alumnos(){
        return numerodealumnos;
    }
    
    public int obtenernumero_de_docentes(){
        return numerodedocentes;
    }
    
    public int obtenernumero_de_sedes(){
        return numerodesedes;
    }
    
    public double obtenergastos_por_estudiante(){
        return gastosporestudiante;
    }
    
    public double obtenerpresupuesto(){
        return presupuesto;
    }
}
