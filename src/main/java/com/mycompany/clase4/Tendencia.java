
package com.mycompany.clase4;

public class Tendencia implements Estado {

    
    @Override
    public void leyenda(Cancion cancion) {
        System.out.println(" estado tendencia");
       Icono.FUEGO.texto(cancion);
       
    }
  
}
