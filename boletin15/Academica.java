/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

import paquete2.Persoal;


/**
 *
 * @author doutedasolla
 */
public class Academica {
 
    public static int numReferencia = 2020;
    private String nome;
    private int nota;
    private Persoal alumno;

    public static String numReferencia(int referencia) {
        do {
            System.out.println("El alumno esta matriculado en " + referencia);
            referencia++;
        } while (referencia <= 2025);
        return null;
    }

    public Academica() {
    }

    public Academica(int numReferencia, String nome, int nota, Persoal alumno) {
        this.nome = nome;
        this.nota = nota;
        this.alumno = alumno;
        this.numReferencia = numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public int getNota() {

        return nota;
    }

    public void setNota(int nota) {

        this.nota = nota;
    }

    public Persoal getAlumno() {
        return alumno;
    }

    public void setAlumno(Persoal alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "***DATOS***" + "\nnº referencia: " + numReferencia + "\nNome: " + nome + "\nNota: " + nota + "\n" + alumno;
    }

}
