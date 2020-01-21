/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

import paquete2.Persoal;
import paquete3.NotaMedia;

/**
 *
 * @author doutedasolla
 */
public class Boletin15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persoal dani = new Persoal("66666666c", "dani@mail");
        NotaMedia nota = new NotaMedia();

        Academica ac = new Academica(Academica.numReferencia, "Dani", nota.calcularNotaMedia(), dani);
        System.out.println(ac.toString());
    }

}
