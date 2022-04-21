package PaqHotel;

import java.io.Serializable;

public class Cliente implements Serializable {
    private String nombre;
    private String apellidos;
    private int dni;
    private int teléfono;
    private int numTarjeta;
    private String alta;
    private String baja;
    private String régimen;

    public Cliente(String nombre, String apellidos, int dni, int teléfono, int numTarjeta, String alta, String baja, String régimen) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.teléfono = teléfono;
        this.numTarjeta = numTarjeta;
        this.alta = alta;
        this.baja = baja;
        this.régimen = régimen;
    }

    public Cliente() {
        this.nombre = null;
        this.apellidos = null;
        this.dni = 0;
        this.teléfono = 0;
        this.numTarjeta = 0;
        this.alta = null;
        this.baja = null;
        this.régimen = null;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTeléfono() {
        return this.teléfono;
    }

    public void setTeléfono(int teléfono) {
        this.teléfono = teléfono;
    }

    public int getNumTarjeta() {
        return this.numTarjeta;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getAlta() {
        return this.alta;
    }

    public void setAlta(String alta) {
        this.alta = alta;
    }

    public String getBaja() {
        return this.baja;
    }

    public void setBaja(String baja) {
        this.baja = baja;
    }

    public String getRégimen() {
        return this.régimen;
    }

    public void setRégimen(String régimen) {
        this.régimen = régimen;
    }

    public String toString() {
        return "Nombre: " + this.nombre + " " + this.apellidos + "\tDNI: " + this.dni + "\nTeléfono: " + this.teléfono + "\tNúmero de tarjeta: " + this.numTarjeta + "\nFecha de alta: " + this.alta + "\tFecha de baja: " + this.baja + "\nRégimen: " + this.régimen;
    }
}
