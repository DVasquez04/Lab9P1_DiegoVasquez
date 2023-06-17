/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9p1_diegovasquez;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Diego Vasquez
 */
public class Lab9P1_DiegoVasquez {
static Scanner lea = new Scanner(System.in);
static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Boolean seguir = true;
        ArrayList<Libros> libros = new ArrayList<>();
        while (seguir){
            System.out.println("=Menu=");
            System.out.println("1.Ejercicio");
            System.out.println("2.Salir");
            int opcion = lea.nextInt();
            switch (opcion){
            case 1: {
            boolean next = true;
            int numBooks = 0;
            
            while(next){
                System.out.println("Menu Libros");
                System.out.println("1.Agregar Libros");
                System.out.println("2.Listar Libros");
                System.out.println("3.modificar libros");
                System.out.println("4.Eliminar libro");
                System.out.println("5.buscar libro por Titulo");
                System.out.println("6.buscar libro segun Autor");
                System.out.println("7.Busqueda con filtro de Genero");
                System.out.println("8.Salir submenu");
                int op = lea.nextInt();
                switch (op){
                case 1:{
                    System.out.println("Opción ingresada: 1");
                    System.out.println("Ha elegido la opcion para agregar un libro, por favor aporte la informacion solicitada:");
                    System.out.println("Titulo: ");
                    String Titulo = sc.nextLine();
                    System.out.println("Autor: ");
                    String Autor = sc.nextLine();
                    System.out.println("Genero: ");
                    String Genero = sc.nextLine();
                    System.out.println("Edad mmínima: ");
                    int Edad = lea.nextInt();
                    while (Edad < 0 || Edad > 150){
                        System.out.println("Solo numeros serios porfavor... \n Intentelo de nuevo:");
                        Edad = lea.nextInt();
                    }//fin validacion
                    
                    Libros libro = new Libros(Titulo, Autor, Genero, Edad);
                    libros.add(libro);
                    System.out.println("Libro agregado exitosamente!");
                    numBooks ++;
                    
                }//fin case 1
                break; 
                case 2:{
                    if(numBooks == 0){
                        System.out.println("Porfavor agrege un libro con la opcion 1 :D");
                        System.out.println("");
                    }else{
                        System.out.println("Opcion Ingresada: 2");
                        System.out.println("Libros Disponibles:");
                        System.out.println("");
                        for (int i = 0; i < libros.size(); i++) {
                            System.out.println("Libro "+(i+1));
                            System.out.println(libros.get(i).toString());
                            System.out.println("");
                        }//fin for
                    }//fin if
                }//fin case 2
                break;
                case 3:{
                   if(numBooks == 0){
                        System.out.println("Porfavor agrege un libro con la opcion 1 :D");
                        System.out.println("");
                    }else{
                        System.out.println("Opcion ingresada: 3");
                        System.out.println("Ha ingresado la opcion de modificar libros, elija el libro que modificara: ");
                        System.out.println("");
                        for (int i = 0; i < libros.size(); i++) {
                            System.out.println("Libro "+(i+1));
                            System.out.println(libros.get(i).toString());
                            System.out.println("");
                        }//fin for
                        System.out.println("Libro seleccionado: ");
                        int book = lea.nextInt();
                        while (book <= 0 || book > libros.size()){
                            System.out.println("Esa posicion de libro no existe \n intentelo denuevo: ");
                            book = lea.nextInt();
                        }//fin validacion
                        book --;
                        System.out.println("Ha seleccionado el libro: "+libros.get(book).getTitulo()+", ¿Qué atributo desea modificar?");
                        System.out.println("""
                                           1. Titulo
                                           2. Autor
                                           3. Genero
                                           4. Edad Mínima""");
                        int atri = lea.nextInt();
                        while(atri <= 0 || atri > 4){
                            System.out.println("Atributo invalido, \n intentelo de nuevo:");
                            atri = lea.nextInt();
                        }
                        System.out.println("Opción ingresada: "+atri);
                        switch(atri){
                            case 1:{
                                System.out.println("Ha seleccionado el Titulo del libro, ingrese un nuevo titulo: ");
                                String Titulo = sc.nextLine();
                                libros.get(book).setTitulo(Titulo);
                            }//fin titulo
                            break;
                            case 2:{
                                System.out.println("Ha seleccionado el Autor del lirbpo, ingrese un nuevo Autor: ");
                                String Autor = sc.nextLine();
                                libros.get(book).setAutor(Autor);
                            }//fin autor
                            break;
                            case 3:{
                                System.out.println("Ha seleccionado el Genero del libro, ingrese un nuevo género: ");
                                String Genero = sc.nextLine();
                                libros.get(book).setGenero(Genero);
                            }//fin genero
                            break;
                            case 4:{
                                System.out.println("Ha seleccionado la Edad Minima del libro, ingrese un nuevo género: ");
                                int Edad = lea.nextInt();
                                libros.get(book).setEdad(Edad);
                            }//fin edad minima
                            break;
                        }//fin switch
                        System.out.println("!Libro modificado exitosamente!");
                    }//fin if

                }// fin case 3
                break; 
                case 4:{
                    if(numBooks == 0){
                        System.out.println("Porfavor agrege un libro con la opcion 1 :D");
                        System.out.println("");
                    }else{
                        System.out.println("Ha seleccionado Eliminar un libro");
                        System.out.println("");
                        for (int i = 0; i < libros.size(); i++) {
                            System.out.println("Libro "+(i+1));
                            System.out.println(libros.get(i).toString());
                            System.out.println("");
                        }//fin for
                        System.out.println("Seleccione un libro: ");
                        int book = lea.nextInt();
                        while (book <= 0 || book > libros.size()){
                            System.out.println("Esa posicion de libro no existe \n intentelo denuevo: ");
                            book = lea.nextInt();
                        }//fin validacion
                        book --;
                        libros.remove(book);
                        System.out.println("¡Libro Eliminado Exitosamente!");
                        numBooks--;
                    }

                }//fin case 4
                break;
                case 5:{
                    if(numBooks == 0){
                        System.out.println("Porfavor agrege un libro con la opcion 1 :D");
                        System.out.println("");
                    }else{
                        int bookTitles = 0;
                        System.out.println("Opcion ingresada: 5");
                        System.out.println("Ingrese el Titulo a buscar: ");
                        String Titulo = sc.nextLine().trim();
                        for (int i = 0; i < libros.size(); i++) {
                            if(libros.get(i).getTitulo().equalsIgnoreCase(Titulo)){
                                bookTitles++;
                            }//fin if 
                        }//fin for
                        if(bookTitles == 0){
                            System.out.println("No se encontro ningun libtro con ese titulo.");
                        }else{
                            System.out.println("Libros con Titulo "+ Titulo+":");
                            int cont = 1;
                            for (int i = 0; i < libros.size(); i++) {
                            if(libros.get(i).getTitulo().equalsIgnoreCase(Titulo)){
                                System.out.println("Libro "+ cont);
                                System.out.println(libros.get(i).toString());
                                System.out.println("");
                                cont++;
                            }//fin if 
                        }//fin for
                        }//fin else
                        
                    }//fon out if
                }//fin case 5
                break;
                case 6: {
                    if(numBooks == 0){
                        System.out.println("Porfavor agrege un libro con la opcion 1 :D");
                        System.out.println("");
                    }else{
                        int bookTitles = 0;
                        System.out.println("Opcion ingresada: 6");
                        System.out.println("Ingrese el Autor a buscar: ");
                        String Autor = sc.nextLine().trim();
                        for (int i = 0; i < libros.size(); i++) {
                            if(libros.get(i).getAutor().equalsIgnoreCase(Autor)){
                                bookTitles++;
                            }//fin if 
                        }//fin for
                        if(bookTitles == 0){
                            System.out.println("No se encontro ningun libtro con ese Autor.");
                        }else{
                            System.out.println("Libros con Autor "+ Autor+":");
                            int cont = 1;
                            for (int i = 0; i < libros.size(); i++) {
                            if(libros.get(i).getAutor().equalsIgnoreCase(Autor)){
                                System.out.println("Libro "+ cont);
                                System.out.println(libros.get(i).toString());
                                System.out.println("");
                                cont++;
                            }//fin if 
                        }//fin for
                        }//fin else
                        
                    }//fon out if
                }//fin case 6
                break;
                case 7:{
                    if(numBooks == 0){
                        System.out.println("Porfavor agrege un libro con la opcion 1 :D");
                        System.out.println("");
                    }else{
                        int bookTitles = 0;
                        System.out.println("Opcion ingresada: 7");
                        System.out.println("Ingrese el Genero a buscar: ");
                        String Genero = sc.nextLine().trim();
                        for (int i = 0; i < libros.size(); i++) {
                            if(libros.get(i).getGenero().equalsIgnoreCase(Genero)){
                                bookTitles++;
                            }//fin if 
                        }//fin for
                        if(bookTitles == 0){
                            System.out.println("No se encontro ningun libtro con ese Genero.");
                        }else{
                            System.out.println("Libros con Genero "+ Genero+":");
                            int cont = 1;
                            for (int i = 0; i < libros.size(); i++) {
                            if(libros.get(i).getGenero().equalsIgnoreCase(Genero)){
                                System.out.println("Libro "+ cont);
                                System.out.println(libros.get(i).toString());
                                System.out.println("");
                                cont++;
                            }//fin if 
                        }//fin for
                        }//fin else
                        
                    }//fon out if
                }//fin case 7
                break;
                case 8:{
                    next = false;
                }//fin salir
                break;
                default:{
                System.out.println("Opcion Invalida");
                }//fin default
                break;

            }//fin switch op
            }// fin while continue
            }//fin case 1
            break;
            case 2:{
            seguir = false; 
            }//fin case 2
            break; 
            default:{
                System.out.println("Opcion invalida");
            }//fin case 3
            break;
            }//fin switch
        }//fin while seguir
        // TODO code application logic here
    }//fin main
    
}//fin clase
