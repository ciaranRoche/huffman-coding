package controllers;

import models.Data;
import utils.FileInput;

import java.util.List;

/**
 * Created by muldoon on 09/03/17.
 */
public class HuffmanAPI {

    public static String dataString = "";

    public HuffmanAPI(){

    }

    public static void main(String[] args) throws Exception {
        prime();
        System.out.println(dataString);
    }

    public static void prime() throws Exception{
        FileInput in = new FileInput();
        List<Data> d = in.loadData("././data/data");
        for(Data data : d){
            dataString = dataString + data;
        }
    }
}
