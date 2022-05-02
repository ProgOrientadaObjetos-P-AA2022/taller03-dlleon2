/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_Uno;

/**
 *
 * @author LENOVO
 */
public class EquivalenteHora {
    private double hora;
    private double minutos;
    private double segundos;
    private double dias;
    
    public void establecerhoras(double h) {
        hora = h;
    }
    
    public void establecerminutos(double h) {
        minutos = hora * 60;
    }
    
    public void establecersegundos(double h){
        segundos = hora * 3600;
    }
    
    public void establecerdias(double h){
        dias = hora / 24;
    }
    
    public double obtenerhoras(){
        return hora;
    }
     
    public double obtenerminutos(){
        return minutos;
    }
     
    public double obtenersegundos(){
        return segundos;
    }
    
    public double obtenerdias(){
        return dias;
    }
 
}
