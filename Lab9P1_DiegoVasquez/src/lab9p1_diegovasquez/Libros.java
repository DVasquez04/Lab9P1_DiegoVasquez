/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p1_diegovasquez;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Diego Vasquez
 */
public class Libros {
    public String Titulo;
    public String Autor;
    public String Genero;
    public int Edad;

    public Libros(String Titulo, String Autor, String Genero, int Edad) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Genero = Genero;
        this.Edad = Edad;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public String getGenero() {
        return Genero;
    }

    public int getEdad() {
        return Edad;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return  "Titulo= " + Titulo +"\n"+ "Autor= " + Autor +"\n"+ "Genero= " + Genero +"\n"+ "Edad= " + Edad;
    }
    
    
    
}
