package utils;

import edu.princeton.cs.introcs.In;
import models.Node;

import java.io.File;
import java.io.PipedInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ciaran roche on 06/03/17.
 */
public class FileInput {



    public List<Node> loadData(String filename) throws Exception{
        File file = new File(filename);
        In in = new In(file);

        List<Node> nodes = new ArrayList<>();
        while(!in.isEmpty()){
            String details = in.readLine();


        }
        return nodes;
    }
}
