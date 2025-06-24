package org.example.juanjosegallego;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) {

        //ENTRADAS
        Scanner keyEntry = new Scanner(System.in);
        Integer menuOption=null;
        String colorVerde="\u001B[32m";
        ArrayList<Object> productos = new ArrayList<>();

        //PROCESO 1 (Crear el menu de opciones)
        System.out.println("\n******************");
        System.out.println("***** Uribe APP *****");
        System.out.println("******************");
        System.out.println("\n👕 Bienvenido a gestor de prendas...\n");
        System.out.println("¿Qué quieres realizar?");
        System.out.println(colorVerde+"1️⃣  Guardar una prenda en BD 📝");
        System.out.println("2️⃣  Mostrar el inventario de prendas 📦");
        System.out.println("3️⃣  Modificar los datos de una prenda ✏️");
        System.out.println("4️⃣  Eliminar una prenda del sistema 🗑️");
        System.out.println("5️⃣  Presiona 5 para SALIR ❌");

        System.out.println("Dijita una opción: ");
        menuOption=keyEntry.nextInt();
        
        while(true){
            HashMap<String, Object> diccionario = new HashMap<>();
            try{
                if (menuOption==1){
                    System.out.println("Registrando un producto...");

                    //AGREGANDO UN ELEMENTO A UNA LISTA DE JAVA
                    System.out.println("Dijita el Producto que quieres agregar a la BD: ");
                    /*keyEntry.nextLine();
                    productos.add (keyEntry.nextLine());
                    //productos.add("Camiseta");
                    //productos.add("Pantaloneta");*/

                    //Creando objetos / diccionario / hashmaps en java


                    //Llenando un diccionario
                    System.out.println("Dijita el id del producto: ");
                    diccionario.put("id", keyEntry.nextInt());

                    System.out.println("Dijita el Precio del producto: ");
                    diccionario.put("precio", keyEntry.nextInt());

                    System.out.println("dijita el nombre del produccto: ");
                    keyEntry.nextLine(); //------------->Limpiar el Buffer
                    diccionario.put("nombre", keyEntry.nextLine());
                    productos.add(diccionario);
                    System.out.println(diccionario);

                }
                else if(menuOption==2){
                    System.out.println("Mostrando el Inventario...");
                    //MOSTRANDO UNA LISTA
                    System.out.println(productos);
                }
                else if (menuOption==3) {
                    System.out.println("Modificando un producto...");
                }
                else if (menuOption==4) {
                    System.out.println("Eliminando un producto del inventario...");
                }
                else if (menuOption==5) {
                    System.out.println("Gracias por utilizar nuestras app...");
                    break;
                }
                System.out.println("Ahora Dijita otra opcion: ");
                menuOption=keyEntry.nextInt();
            }
            catch (Exception error){
                System.out.println(error.getMessage());
            }
        }

        //PROCESO 2

        //PROCESO 3

        //SALIDAS

    }
}
