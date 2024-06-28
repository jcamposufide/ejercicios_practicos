package com.intro.ejercicio_practico_2;

public class Cancion {
    // Atributos y sus tipos
    private int idCancion;
    private String titulo;
    private String autor;
    private double duracion;
    private int anoCreacion;

    // Acá se crea el constructor
    public Cancion(int idCancion, String titulo, String autor, double duracion, int anoCreacion) {
        this.idCancion = idCancion;
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.anoCreacion = anoCreacion;
    }

    // Acá están todos los getters
    public int getIdCancion() {
        return idCancion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getDuracion() {
        return duracion;
    }

    public int getAnoCreacion() {
        return anoCreacion;
    }

    // Acá están todos los setters
    public void setIdCancion(int idCancion) {
        this.idCancion = idCancion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void setAnoCreacion(int anoCreacion) {
        this.anoCreacion = anoCreacion;
    }

}

