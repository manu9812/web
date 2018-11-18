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
public class conexion {
    
    private EnlazarFacturas ef = new EnlazarFacturas();
    
    public conexion(){}
    
    public void guardarFactura(String articulo,int cantidad,int valorUnitario,String nombreCliente,String telefono, String direccion)
    {
        int id = ef.contarFactura();
        int valorTotal = valorUnitario*cantidad;
        ef.addEnd(new Factura(nombreCliente,telefono,direccion,0,valorUnitario,valorTotal,articulo,cantidad));
        ef.escribirArchivo();
    }
    
    public int buscarPrecioArticulo(String articulo)
    {
        Articulos articulos = new Articulos();
        int precio = 0;
        
        if( articulo.equals("Tanga") )
        {
            precio = articulos.Tanga();
        }
        else if( articulo.equals("Encaje") )
        {
            precio = articulos.Encaje();
        }
        else if( articulo.equals("Cucos") )
        {
            precio = articulos.Cucos();
        }
        
        return precio;
    }
}
