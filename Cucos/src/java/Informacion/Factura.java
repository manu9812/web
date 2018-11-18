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
public class Factura{
    
    private int id;
    private int precioUnitario;
    private int valorTotal;
    private String nombreCliente;
    private int cantidad;
    private String articulo;
    private String telefono;
    private String direccion;
    public Factura next = null;
    
    public Factura(){}
    
    public Factura(String nombreCliente,String telefono, String direccion, int id, int precioUnitario, int valorTotal,
               String articulo, int cantidad)
    {
        this.nombreCliente = nombreCliente;
        this.telefono = telefono;
        this.direccion = direccion;
        this.id = id;
        this.precioUnitario = precioUnitario;
        this.valorTotal = valorTotal;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.next = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String toString()
    {
        return this.id + ";" + this.articulo + ";" + this.cantidad + ";" +this.precioUnitario + ";" + 
                this.valorTotal + ";" + this.nombreCliente 
                + ";" + this.telefono + ";" + this.direccion + "\n";
    }
}
