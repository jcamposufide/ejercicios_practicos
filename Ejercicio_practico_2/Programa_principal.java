
package com.intro.ejercicio_practico_2;

public class Programa_principal {
    public static void main(String[] args) {
        // Esta es la instancia de Cancion asignando valores deprueba para los atributos
        Cancion primeraCancion = new Cancion(101, "Given Up", "Linkin Park", 3.09, 2008);

        // Se muestran los atributos usando los getters
        System.out.println("El ID de la canción es: " + primeraCancion.getIdCancion());
        System.out.println("Título: " + primeraCancion.getTitulo());
        System.out.println("Autor: " + primeraCancion.getAutor());
        System.out.println("Duración: " + primeraCancion.getDuracion());
        System.out.println("Año de creación: " + primeraCancion.getAnoCreacion());

        // Se prueba hacer la modifican algunos atributos usando los setters
        primeraCancion.setIdCancion(102);
        primeraCancion.setTitulo("Given Up Live");
        primeraCancion.setAutor("Linkin Park Live");
        primeraCancion.setDuracion(3.28);
        primeraCancion.setAnoCreacion(2009);

        // Mostrar los atributos modificados usando los getters
        System.out.println("ID de la canción modificado: " + primeraCancion.getIdCancion());
        System.out.println("Título modificado: " + primeraCancion.getTitulo());
        System.out.println("Autor modificado: " + primeraCancion.getAutor());
        System.out.println("Duración modificada: " + primeraCancion.getDuracion());
        System.out.println("Año de creación modificado: " + primeraCancion.getAnoCreacion());
    }
}
