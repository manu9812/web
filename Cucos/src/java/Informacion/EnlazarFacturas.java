/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Informacion;

/**
 *
 * @author Maicol Pulido
 */
public class EnlazarFacturas {
    
    private Factura head = new Factura();
    
    public void addEnd(Factura factura)
    {
        Factura temp = head;
        
        while(temp.next != null)
        {
            temp = temp.next;
        }
        factura.next = null;
        temp.next = factura;
        
    }
    
    public Factura searchID(int ID)
    {
        Factura temp = head;
        
        while(temp.next != null)
        {
            if(temp.getId() == ID)
            {
                return temp;
            }
        }
        return temp;
        
    }
    
    public int contarFactura()
    {
        Factura temp = head.next;
        int i = 0;
        
        while(temp.next != null)
        {
            i ++;
            temp = temp.next;
        }
        
        return i++;
    } 
    
    public Factura modificarFactura(Factura factura , int cantidad, String nombreCliente )
    {
        factura.setCantidad(cantidad);
        factura.setNombreCliente(nombreCliente);
        return factura;
    }
    
    public void escribirArchivo()
    {
        Guardar guardar = new Guardar();
        Factura temp = head.next;
        String contenido = "";
        while(temp != null)
        {
            contenido += temp.toString();
        }
        
        guardar.escribir(contenido);
    }
    
}
