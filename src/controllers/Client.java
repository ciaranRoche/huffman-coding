package controllers;


import asg.cliche.Command;
import asg.cliche.Shell;
import asg.cliche.ShellFactory;
import models.Data;
import models.Huffman;

/**
 * Created by Ciaran Roche on 09/03/17.
 */
public class Client {
    public Huffman huff;
    public HuffmanAPI huffAPI;
    public Data data;

    public void Client(){}

    public static void main(String[] args) throws Exception{
        Client client = new Client();
        Shell shell = ShellFactory.createConsoleShell("HUFF", "<<<<------------------------------------------------->>>>\n             Welcome to the Huffman Generator\n<<<<------------------------------------------------->>>>\n- ?help for instructions\n- ?list for commands",client);
        shell.commandLoop();
    }

    @Command(description = "Load External File")
    public String load() throws Exception{
        huffAPI.prime();
        return "File Loaded";
    }

}
