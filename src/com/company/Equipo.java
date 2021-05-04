package com.company;

public class Equipo {

    String nombre;
    String entrenador;
    int division;
    int par; //torneos participados
    int tg; //torneos ganados
    int tp;  // torneos perdidos


    public String getNombre() {
        return nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEntrenador() {
        return  entrenador = entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public int getDivision() {
        return division = division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public int getPar() {
        return par;
    }

    public void setPar(int par) {
        this.par = par;
    }

    public int getTg() {
        return tg;
    }

    public void setTg(int tg) {
        this.tg = tg;
    }

    public int getTp() {
        return tp;
    }

    public void setTp(int tp) {
        this.tp = tp;
    }

    public Equipo (String nombre, String entrenador, int division, int par, int tg, int tp) {

    }
}
