
package com.mycompany.clase4;

public class Cancion {
 ContextoCancion contexto = new ContextoCancion();
    private String titulo;
    private String nombreArtista;
    private String album;
    private int anioAlbum;
    private int like;
    private int dislike;
    private int reproducciones;
    private boolean reproducidaEnUltimas24Horas;

    public Cancion(String titulo, String nombreArtista, String album, int anioAlbum) {
        this.titulo = titulo;
        this.nombreArtista = nombreArtista;
        this.album = album;
        this.anioAlbum = anioAlbum;
        this.like = 0;
        this.dislike = 0;
        this.reproducciones = 0;
        this.reproducidaEnUltimas24Horas = true;
    }


    public Cancion() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getAnioAlbum() {
        return anioAlbum;
    }

    public void setAnioAlbum(int anioAlbum) {
        this.anioAlbum = anioAlbum;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
       
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }
    
    
    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
       
    }
    
    

    public boolean isReproducidaEnUltimas24Horas() {
        return reproducidaEnUltimas24Horas;
    }

    public void setReproducidaEnUltimas24Horas(boolean reproducidaEnUltimas24Horas) {
        this.reproducidaEnUltimas24Horas = reproducidaEnUltimas24Horas;
    
    }
    
    
    
        
    public int darLike() {
    int nuevoLike = getLike() + 1;
    setLike(nuevoLike);
    
    return nuevoLike;
    }
    
    public int darDislike() {
    int nuevoDislike = getDislike() + 1;
    setDislike(nuevoDislike);
    
    return nuevoDislike;

    }

    
    

    @Override
    public String toString() {
        
        return   "Titulo Cancion : " + titulo + "\n" + "Nombre Artista: " + nombreArtista + "\n" + "Album: " + album + "\n" + "Año Album: " + anioAlbum ;
    }
    
    
    

   
    
    
}
