package models;

import java.util.Calendar;
import java.util.HashMap;

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

    public static HashMap<Character, Integer> frequencies(String s){
        HashMap<Character, Integer> freq = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(freq.containsKey(ch)){
                freq.put(ch, freq.get(ch)+1);
            }else{
                freq.put(ch, 1);
            }
        }
        return freq;
    }



}
