/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniphp;
import java.io.File;

/**
 *
 * @author Ricardo
 */
public class miniphp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String Ruta = "C:/Users/Ricardo/Documents/Lenguajes/miniphp/src/miniphp/MyRegEx.txt";
        GenerarLexer(Ruta);
    }
    
    public static void GenerarLexer(String path)
    {
        File file = new File(path);
        jflex.Main.generate(file);
    }
}
