/*
 *
 */
package Informacion;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Maicol Pulido
 */
public class Generacion_Factura {
   
    private void GenerarPDF() {                                         
        
        String ruta= "C:\\Users\\manuela garcia\\Archivos";
        String contenido =" ";
        Guardar guardar = new Guardar();
        
        try{
            FileOutputStream archivo= new FileOutputStream(ruta+ ".pdf");
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            doc.add(new Paragraph(contenido));
            doc.close();
            JOptionPane.showMessageDialog(null, "PDF    correctamente creado");
        
        } catch(Exception e){
            System.out.println("ERROR!!!, No se  pudo general el PDF : "+ e);
        }   
        
        String[] arreglo = contenido.split("\n");
            
        String[] arregloClientes = arreglo[arreglo.length-1].split(";");
        String informacion = "Nombre: "+ arregloClientes[0]+ "\n"+ 
                "Telefono: "+ arregloClientes[1]+ "\n"+
                "Direccion: "+ arregloClientes[2]+ "\n"+
                "ID: "+  arregloClientes[3]+ "\n"+
                "Precio Unitario: "+ arregloClientes[4]+ "\n"+
                "Precio Total: "+ arregloClientes[5]+ "\n"+ 
                "Producto: "+ arregloClientes[6]+ "\n"+
                "Cantidad: "+ arregloClientes[7]+ "\n" 
                ;
        
        
        
    }                                          
}
