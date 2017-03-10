package controllers;

import models.Data;
import models.Huffman;
import utils.FileInput;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Ciaran Roche on 09/03/17.
 */
public class HuffmanAPI {

    private static Huffman huff;
    private static String dataString = "";
    public static Scanner input;

    public HuffmanAPI(){
        huff = new Huffman();
        input = new Scanner(System.in);
    }

    public static String prime(String file) throws Exception{
        FileInput in = new FileInput();
        List<Data> d = in.loadData(file);
        for(Data data : d){
            dataString = dataString + data;
        }
        return dataString;
    }

    public static void encode(String s, String st) throws Exception{
        HashMap<Character, Integer> frequencies = huff.frequencies(s);
        Huffman.Node root = huff.huffmanTree(frequencies);

        HashMap<Character, String> encoded = huff.encodied(root);

        String huff = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (encoded.containsKey(ch)) {
                huff = huff + encoded.get(ch);
            }
        }

        System.out.println("The huffman encoded string of bits for: \n" + s + "\nis: \n" + huff);
        System.out.println("The key for the code is: \n" + encoded);

        final OutputStream os = new FileOutputStream(st);
        final PrintStream ps = new PrintStream(os);
        ps.print("The huffman encoded string of bits for: \n" + s + "\n\nis: \n" + huff);
        ps.close();
        System.out.println("\nFile saved to: " + s);
    }

    public String getDataString(){return dataString;}

    public Huffman getHuff(){return huff;}



}
