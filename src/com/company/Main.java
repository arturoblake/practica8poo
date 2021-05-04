package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Jugador jugadorx = new Jugador("Messi", 10, 20, "Defensa", 1.87);

        Scanner comando = new Scanner(System.in);
        boolean salir = false;
        int opcion = 0;
        int opc = 0;

        ArrayList<Jugador> Equipo1 = new ArrayList<>();
        ArrayList<Jugador> Equipo2 = new ArrayList<>();
        ArrayList<Jugador> Equipo3 = new ArrayList<>();
        ArrayList<Jugador> Equipo4 = new ArrayList<>();
        ArrayList<Jugador> Equipo5 = new ArrayList<>();

        while (!salir) {

            System.out.println("1) Equipo 1");
            System.out.println("2) Equipo 2");
            System.out.println("3) Equipo 3");
            System.out.println("4) Equipo 4");
            System.out.println("5) Equipo 5");
            System.out.println("6) Salir");
            opcion = comando.nextInt();
            comando.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresar numero de jugador: ");
                    String nombre = comando.nextLine();
                    System.out.println("Ingresar numero: ");
                    int num = comando.nextInt();
                    System.out.println("Puntos anotados: ");
                    int pa = comando.nextInt();
                    System.out.println("Posicion: ");
                    String posicion = comando.nextLine();
                    System.out.println("Estatura: ");
                    double estatura = comando.nextDouble();
                    comando.nextLine();
                    Jugador jugador1 = new Jugador(nombre, num, pa, posicion, estatura);
                    Equipo1.add(jugador1);

                    for (int i = 0; i < Equipo1.size(); i++) {
                        Jugador actual = Equipo1.get(i);
                        System.out.println("Nombre: ");
                        System.out.println(actual.nombre);
                        System.out.println("Numero: ");
                        System.out.println(actual.num);
                        System.out.println("Puntos anotados: ");
                        System.out.println(actual.pa);
                        System.out.println("Posicion: ");
                        System.out.println(actual.posicion);
                        System.out.println("Estatura: ");
                        System.out.println(actual.estatura);
                    }
                    break;
                case 2:
                    System.out.println("Ingresar numero de jugador: ");
                    String nombre = comando.nextLine();
                    System.out.println("Ingresar numero: ");
                    int num = comando.nextInt();
                    System.out.println("Puntos anotados: ");
                    int pa= comando.nextInt();
                    System.out.println("Posicion: ");
                    String posicion = comando.nextLine();
                    System.out.println("Estatura: ");
                    double estatura = comando.nextDouble();
                    comando.nextLine();
                    Jugador jugador = new Jugador(nombre, num, pa, posicion, estatura);
                    Equipo2.add(jugador);

                    for (int i = 0; i < Equipo2.size(); i++) {
                        Jugador actual = Equipo2.get(i);
                        System.out.println("Nombre: ");
                        System.out.println(actual.nombre);
                        System.out.println("Numero: ");
                        System.out.println(actual.num);
                        System.out.println("Puntos anotados: ");
                        System.out.println(actual.pa);
                        System.out.println("Posicion: ");
                        System.out.println(actual.posicion);
                        System.out.println("Estatura: ");
                        System.out.println(actual.estatura);
                    }
                    break;
                case 3:
                    System.out.println("Ingresar numero de jugador: ");
                    String nombre = comando.nextLine();
                    System.out.println("Ingresar numero: ");
                    int num = comando.nextInt();
                    System.out.println("Puntos anotados: ");
                    int pa = comando.nextInt();
                    System.out.println("Posicion: ");
                    String posicion = comando.nextLine();
                    System.out.println("Estatura: ");
                    double estatura = comando.nextDouble();
                    comando.nextLine();
                    Jugador jugador3 = new Jugador(nombre, num, pa, posicion, estatura);
                    Equipo3.add(jugador3);

                    for (int i = 0; i < Equipo3.size(); i++) {
                        Jugador actual = Equipo3.get(i);
                        System.out.println("Nombre: ");
                        System.out.println(actual.nombre);
                        System.out.println("Numero: ");
                        System.out.println(actual.num);
                        System.out.println("Puntos anotados: ");
                        System.out.println(actual.pa);
                        System.out.println("Posicion: ");
                        System.out.println(actual.posicion);
                        System.out.println("Estatura: ");
                        System.out.println(actual.estatura);
                    }
                    break;
                case 4:
                    System.out.println("Ingresar numero de jugador: ");
                    String nombre = comando.nextLine();
                    System.out.println("Ingresar numero: ");
                    int num = comando.nextInt();
                    System.out.println("Puntos anotados: ");
                    int pa = comando.nextInt();
                    System.out.println("Posicion: ");
                    String posicion = comando.nextLine();
                    System.out.println("Estatura: ");
                    double estatura = comando.nextDouble();
                    comando.nextLine();
                    Jugador jugador4 = new Jugador(nombre, num, pa, posicion, estatura);
                    Equipo4.add(jugador4);

                    for (int i = 0; i < Equipo4.size(); i++) {
                        Jugador actual = Equipo4.get(i);
                        System.out.println("Nombre: ");
                        System.out.println(actual.nombre);
                        System.out.println("Numero: ");
                        System.out.println(actual.num);
                        System.out.println("Puntos anotados: ");
                        System.out.println(actual.pa);
                        System.out.println("Posicion: ");
                        System.out.println(actual.posicion);
                        System.out.println("Estatura: ");
                        System.out.println(actual.estatura);
                    }
                    break;
                case 5:
                    System.out.println("Ingresar numero de jugador: ");
                    String nombre = comando.nextLine();
                    System.out.println("Ingresar numero: ");
                    int num = comando.nextInt();
                    System.out.println("Puntos anotados: ");
                    int pa = comando.nextInt();
                    System.out.println("Posicion: ");
                    String posicion = comando.nextLine();
                    System.out.println("Estatura: ");
                    double estatura = comando.nextDouble();
                    comando.nextLine();
                    Jugador jugador5 = new Jugador(nombre, num, pa, posicion, estatura);
                    Equipo5.add(jugador5);

                    for (int i = 0; i < Equipo5.size(); i++) {
                        Jugador actual = Equipo5.get(i);
                        System.out.println("Nombre: ");
                        System.out.println(actual.nombre);
                        System.out.println("Numero: ");
                        System.out.println(actual.num);
                        System.out.println("Puntos anotados: ");
                        System.out.println(actual.pa);
                        System.out.println("Posicion: ");
                        System.out.println(actual.posicion);
                        System.out.println("Estatura: ");
                        System.out.println(actual.estatura);
                    }
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("solo numeros del 1 al 6");
            }
        }
    }
}
