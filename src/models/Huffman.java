package models;

/**
 * Created by Ciaran Roche on 06/03/17.
 */
public class Huffman{
    public class Node implements Comparable<Node> {
        private char ch;
        private int freq;
        private Node left, right;

        public Node(char ch, int freq){
            this.ch = ch;
            this.freq = freq;
            left = null;
            right = null;
        }

        private boolean isLeaf(){
            assert ((left == null) && (right == null)) || ((left != null) && (right != null));
            return ((left == null) && (right == null));
        }

        public int compareTo(Node that){
            return this.freq - that.freq;
        }
    }

    public Huffman(){
    }

    public void frequencyTree(String s){
        for(int i=0; i<=s.length(); i++){
            char input = s.charAt(i);


        }
    }



}
