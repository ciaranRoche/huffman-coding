package controllers;


import asg.cliche.Command;
import asg.cliche.Param;
import asg.cliche.Shell;
import asg.cliche.ShellFactory;
import models.Data;
import models.Huffman;

import java.util.Scanner;

/**
 * Created by Ciaran Roche on 09/03/17.
 */
public class Client {
    public Huffman huff;
    public HuffmanAPI huffAPI;
    public Data data;
    public static Scanner scanner;


    public void Client(){}

    public static void main(String[] args) throws Exception{
        Client client = new Client();
        scanner = new Scanner(System.in);
        Shell shell = ShellFactory.createConsoleShell("HUFF", "<<<<------------------------------------------------->>>>\n             Welcome to the Huffman Generator\n<<<<------------------------------------------------->>>>\n- ?help for instructions\n- ?list for commands",client);
        shell.commandLoop();
    }

    @Command(description = "Load External File")
    public void load() throws Exception{
        System.out.println("Please enter where to save the file: ");
        String save = scanner.nextLine();

        System.out.println("Please give path to file to be encoded: ");
        String file = scanner.nextLine();
        String data = huffAPI.prime(file);
        huffAPI.encode(data, save);


    }

    @Command(description = "Enter String to be Encoded")
    public void enter() throws Exception {
        System.out.println("Please enter where to save the file: ");
        String save = scanner.nextLine();

        System.out.println("Please enter what ever you would like to see in compressed 1`s and 0`s : ");
        String text = scanner.nextLine();
        huffAPI.encode(text, save);
    }

}
