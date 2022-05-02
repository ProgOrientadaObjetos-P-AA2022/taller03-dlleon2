/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_Dos;

/**
 *
 * @author UTPL
 */
public class Terreno {
    private double costoTerreno;
    private double anchoTerreno;
    private double largoTerreno;
    private double areaTerreno;
    private double valorMetroCuadrado;
    
    public void establecerancho(double t) {
        anchoTerreno = t;
    }
    
    public void establecerlargo(double t) {
        largoTerreno = t;
    }
    
    public void establecerarea(double t){
        areaTerreno = anchoTerreno * largoTerreno;
    }
    
    public void establecervalormetrocuadrado(double t){
        valorMetroCuadrado = 1356;
    }
    
    public void establecercosto_terreno(double t){
        costoTerreno = valorMetroCuadrado * areaTerreno;
    }
    
    
    public double obtenerancho(){
        return anchoTerreno;
    }
     
    public double obtenerlargo(){
        return largoTerreno;
    }
     
    public double obtenerarea(){
        return areaTerreno;
    }
    
    public double obtenervalormetrocuadrado(){
        return valorMetroCuadrado;
    }
    
    public double obtenercosto_terreno(){
        return costoTerreno;
    }
}
