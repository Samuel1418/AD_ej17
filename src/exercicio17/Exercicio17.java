/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio17;

import exercicio13.Product;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 *
 * @author oracle
 */
public class Exercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, XMLStreamException {
     
        //Para escribir el xml damos el archivo escribir de arriba
        XMLInputFactory imput = XMLInputFactory.newInstance();
        XMLStreamReader leer = imput.createXMLStreamReader(new FileReader("/home/oracle/Desktop/ProbaExer4/products.xml"));
        
        Product obj = new Product();
        ArrayList<String> listaProduct = new ArrayList<>();
        
        while (leer.hasNext()) {
           leer.next();

           if (leer.getEventType() == XMLStreamReader.CHARACTERS) { //Cogemos lo que hay dentro de las etiquetas
             listaProduct.add(leer.getText());
           }   
           }
            for(int x=0;x<listaProduct.size();x++) {
      System.out.println(listaProduct.get(x));
    }
    }
    
}
