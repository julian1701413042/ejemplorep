package Modelos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pachon
 */
public class archivos {

    String palabra;
    String direccion;
    String nombreArchivo;
    int contador=0;

    public archivos(String palabra, String direccion, String nombreArchivo) {
        this.palabra = palabra;
        this.direccion = direccion;
        this.nombreArchivo = nombreArchivo;
        this.contador = contador;
    }

    public int contar() throws IOException {

        String cadena ;
        String DireccionT = this.direccion + "\\" + this.nombreArchivo;
        String recorrer[] = null;

        try {
            FileReader f= new FileReader(DireccionT);

            BufferedReader b = new BufferedReader(f);

            while ((cadena = b.readLine()) != null) {
                System.out.println("entroooo");

                recorrer = cadena.split("[ ]+");

                for (int i = 0; i < recorrer.length; i++) {

                    recorrer[i] = recorrer[i].replace(",", "");
                    recorrer[i] = recorrer[i].replace(";", "");
                    recorrer[i] = recorrer[i].replace("(", "");
                    recorrer[i] = recorrer[i].replace(")", "");
                    recorrer[i] = recorrer[i].replace(".", "");

                    if (recorrer[i].equalsIgnoreCase(palabra)) {
                        contador++;
                    }
                }

            }
            b.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo a buscar no existe");
        }

        return contador;
    }

}
