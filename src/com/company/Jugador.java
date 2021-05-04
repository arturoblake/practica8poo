package com.company;

public class Jugador {

    int num;
    String nombre;
    int pa;  //puntos anotados
    String posicion;
    Double estatura;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum() {
        return num;
    }

    public void setNum (int num) {
        this.num = num;
    }

    public int getPa (){
        return pa;
    }

    public void setPa(int pa) {
        this.pa = pa;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public Jugador (String name, int num, int pa, String posicion, double estatura) {

    }
}
