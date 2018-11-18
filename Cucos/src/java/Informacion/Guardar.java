/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Informacion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Maicol Pulido
 */
public class Guardar {

    public String leer() throws FileNotFoundException
    {
        File archivo = new File( "C:\\Users\\manuela garcia\\Downloads\\Cucos\\src\\java\\archivo" );
        Scanner sc = new Scanner( archivo );
        String contenido = "";
        EnlazarFacturas ef = new EnlazarFacturas();
        try
        {
            while( sc.hasNextLine() )
            {
                contenido += sc.nextLine() + "\n";
            }
            
            String[] arreglo = contenido.split("\n");
            for (int i = 0; i < arreglo.length ; i++) 
            {
                String[] datos = arreglo[i].split(";");
                ef.addEnd(new Factura( datos[0],datos[1],datos[2],Integer.parseInt(datos[3]),
                        Integer.parseInt(datos[4])
                        ,Integer.parseInt(datos[5]),datos[6]
                        ,Integer.parseInt(datos[7]) ));
                
            }
            
            sc.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        return contenido;
    }
    
    public void escribir(String contenido)
    {
        try
        {
            File archivo = new File( "C:\\Users\\manuela garcia\\Downloads\\Cucos\\src\\java\\archivo" );
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

  
}

