/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author orma_
 */
public class Ak {
    
      String tipo;
    int cargador;
    int precision;
    double velocidadCarga;
    double precio;
    int daño;
    double velocidadDisparo;
    
     public Ak(String tipo, int cargador, int precision, double velocidadCarga, double precio, int daño, double velocidadDisparo)
    {
        this.tipo = tipo;
        this.cargador = cargador;
        this.precision = precision;
        this.velocidadCarga = velocidadCarga;
        this.precio = precio;
        this.daño = daño;
        this.velocidadDisparo = velocidadDisparo;
    }
    
    public Ak(){}  
    
    public void apuntar()
    {
        
    }
    public void recargar()
    {
        
    }

    @Override

   
    public String toString() {
        return "AK{" + "tipo=" + tipo + ", cargador=" + cargador + ", precision=" + precision + ", velocidadCarga=" + velocidadCarga + ", precio=" + precio + ", da\u00f1o=" + daño + ", velocidadDisparo=" + velocidadDisparo + '}';
    }
    
    
}
