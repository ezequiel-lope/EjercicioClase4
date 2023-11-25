
package com.mycompany.clase4;

import javax.swing.JOptionPane;

public class Icono {
public static Icono NOTA_MUSICAL = new Icono(new int[]{0xD83C, 0xDFB5});
public static Icono COHETE = new Icono(new int[]{0xD83D, 0xDE80});
public static Icono FUEGO = new Icono(new int[]{0xD83D, 0xDD25});

private final  int[] internalEncoding;


Icono(int[] internalEncoding){
this.internalEncoding = internalEncoding;
}

public void texto(Cancion cancion) {

    String icono = new String(internalEncoding, 0, internalEncoding.length);
    
  JOptionPane.showMessageDialog(null,icono +"\n" + cancion.toString() , "Reproduciendo" , JOptionPane.DEFAULT_OPTION);
    }
    



}

