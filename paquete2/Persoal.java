/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author doutedasolla
 */
public class Persoal {

    public String Telefono;
    public String email;

    public Persoal() {
    }

    public Persoal(String Telefono, String email) {
        this.Telefono = Telefono;
        this.email = email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persoal{" + "Telefono= " + Telefono + ", email= " + email + '}';
    }

}
