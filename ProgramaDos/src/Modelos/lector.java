/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author pachon
 */
public class lector {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String nombreArchivo= JOptionPane.showInputDialog("Ingrese el nombre del archivo");
        String ruta= JOptionPane.showInputDialog("Ingrese la ruta del archivo");
        String palabra= JOptionPane.showInputDialog("Ingrese la palabra a buscar");
         
        
        archivos archivo1=new archivos(palabra, ruta, nombreArchivo);
        
        if (nombreArchivo!=nombreArchivo) {
            System.out.println("El archivo no existe");
        }
        System.out.println("la palabra "+palabra+"esta: "+archivo1.contar()+" veces");


    }
    
}
