
package com.mycompany.clase4;

public class EnAuge implements Estado {
    

    @Override
    public void leyenda(Cancion cancion) {
        System.out.println(" estado en auge");
       Icono.COHETE.texto(cancion);
       
    }

   
}
