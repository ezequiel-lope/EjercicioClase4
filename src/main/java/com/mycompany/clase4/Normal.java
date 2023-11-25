
package com.mycompany.clase4;

public class Normal implements Estado {



    @Override
    public void leyenda(Cancion cancion) {
        System.out.println(" estado normal");
       Icono.NOTA_MUSICAL.texto(cancion);
     
    }
    
}

