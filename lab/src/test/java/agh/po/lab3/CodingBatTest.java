package agh.po.lab3;

import java.util.Map;
import java.util.HashMap;
import static org.junit.Assert.*;

public class CodingBatTest {

    @org.junit.Test
    public void firstHalf() {
        CodingBat codingBat= new CodingBat();
        assertEquals("test", codingBat.firstHalf("testings"));
    }

    @org.junit.Test
    public void fizzArray() {
        CodingBat codingBat= new CodingBat();
        assertArrayEquals(new int[]{0,1,2,3,4}, codingBat.fizzArray(5));
    }
    @org.junit.Test
    public void diff21() {
        CodingBat codingBat= new CodingBat();
        assertEquals(3,codingBat.diff21(18));
    }
    @org.junit.Test
    public void mapAB() {
        CodingBat codingBat= new CodingBat();
        assertEquals(Map.of("a","Hi"),cb.mapAB(new HashMap<>(()));
    }
    @org.junit.Test
    public void wordLen() {
        CodingBat codingBat= new CodingBat();
        assertEqu;
    }

}