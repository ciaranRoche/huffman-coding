import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import models.Huffman;
import static org.junit.Assert.*;
import java.util.HashMap;

import static models.Huffman.frequencies;

/**
 * Created by ciaran roche on 06/03/17.
 */
public class HuffmanTest {

    @Before
    public void setUp(){
        String s = "mississippi river";
    }

    @After
    public void tearDown(){
        String s = "";
    }

    @Test
    public void testFreq(){
        String s = "mississippi river";
        HashMap<Character, Integer> frequencies = frequencies(s);
        assertEquals(frequencies.containsKey('m'), true);
        assertEquals(frequencies.containsKey('r'), true);
        assertSame(frequencies.containsKey('e'), frequencies.containsKey('m'));
    }
}
