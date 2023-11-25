
package com.mycompany.clase4;


public class ContextoCancion {
    private Estado estado;
    

    public ContextoCancion() {
        this.estado = new Normal();
        
    }

   

   
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
       
    }

   public void leyenda(Cancion cancion) {
    

    
    if (cancion.getReproducciones() > 50000 && cancion.getLike() > 20000) {
        setEstado(new Tendencia());
        if (!cancion.isReproducidaEnUltimas24Horas()) {
        setEstado(new Normal());
    }
    } 
    else if (cancion.getReproducciones() > 1000) {
        setEstado(new EnAuge());
        if (cancion.getDislike() >= 5000) {
        setEstado(new Normal());
    } 
    } 
    estado.leyenda(cancion);
}
}

