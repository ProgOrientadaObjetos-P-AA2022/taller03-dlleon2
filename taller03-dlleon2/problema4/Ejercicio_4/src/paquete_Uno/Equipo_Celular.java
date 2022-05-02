/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete_Uno;


/**
 *
 * @author LENOVO
 */
public class Equipo_Celular {
    private String sistemaOperativo;
    private String direccionMac;
    private String informacionIMEI;
    private String tamañoPantalla;
    private double costoInicial;
    private double iva;
    private double ivaCostoInicial;
    private double costoFinal;
    
   
    
    public void establecer_sistemaOperativo(String c) {
        sistemaOperativo = c;
    }
    
    public void establecer_tamañoPantalla(String c) {
        tamañoPantalla = c;
    }
    
    public void establecer_direccionMac(String c){
        direccionMac = c;
    }
    
    public void establecer_informacionIMEI(String c){
        informacionIMEI = c;
    }
    
    public void establecer_costoInicial(double ci){
        costoInicial = ci;
    }
    
    public void establecer_iva(double c){
        iva = c;
    }
    
    public void establecer_ivaCostoInicial(double c){
        ivaCostoInicial = iva * costoInicial ;
    }
    
    public void establecer_costoFinal(double c){
        costoFinal = (ivaCostoInicial + costoInicial);
    }
    
    public String obtener_sistemaOperativo(){
        return sistemaOperativo;
    }
     
    public String obtener_tamañoPantalla(){
        return tamañoPantalla;
    }
    
    public String obtener_direccionMac(){
        return direccionMac;
    }
    
    public String obtener_informacionIMEI(){
        return informacionIMEI;
    }
    
    public double obtener_costoInicial(){
        return costoInicial;
    }
    
    public double obtener_iva(){
        return iva;
    }
    public double obtener_ivaCostoInicial(){
        return ivaCostoInicial;
    }
    
    public double obtener_costoFinal(){
        return costoFinal;
    }

    
}
