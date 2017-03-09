package controllers;

import models.Data;
import models.Huffman;
import utils.FileInput;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.List;

/**
 * Created by Ciaran Roche on 09/03/17.
 */
public class HuffmanAPI {

    Huffman huff;
    public static String dataString = "";

    public HuffmanAPI(){
        huff = new Huffman();
    }

    public static void main(String[] args) throws Exception {
        prime();
        System.out.println(dataString);
        write(dataString);
    }

    public static void prime() throws Exception{
        FileInput in = new FileInput();
        List<Data> d = in.loadData("././data/data");
        for(Data data : d){
            dataString = dataString + data;
        }
    }

    public static void write(String s) throws Exception{
        final OutputStream os = new FileOutputStream("././data/result");
        final PrintStream ps = new PrintStream(os);
        ps.print(s);
        ps.close();
    }
}
