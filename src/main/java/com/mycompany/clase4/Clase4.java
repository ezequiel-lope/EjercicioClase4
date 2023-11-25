
package com.mycompany.clase4;

public class Clase4 {

    public static void main(String[] args) {
        // Caso 1: "The Scientist" recién se lanza (tiene popularidad normal).
        Cancion cancion = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the head", 2002);
        ContextoCancion contexto = new ContextoCancion();
        contexto.leyenda(cancion);

        // Caso 2: "The Scientist" está en auge por superar el mínimo de reproducciones esperadas.
        cancion.setReproducciones(2000);
        contexto.leyenda(cancion);

        // Caso 3: "The Scientist" baja del auge por tener muchos dislikes.
        cancion.setDislike(6000);
        contexto.leyenda(cancion);

        // Caso 4: "The Scientist" es tendencia por récord de reproducciones y cantidad de personas que le gusta el tema.
        cancion.setReproducciones(60000);
        cancion.setLike(25000);
        contexto.leyenda(cancion);

        // Caso 5: "The Scientist" era tendencia pero vuelve a ser normal por no ser escuchada en las últimas horas.
        cancion.setReproducidaEnUltimas24Horas(false);
        contexto.leyenda(cancion);
    }
}
       
            
       
       
       
       
       