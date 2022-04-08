package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertionHandsOn {

    @SuppressWarnings("unused")
    @Test
    public void assertTesting () {


        String str1 = "Thank you for advance selenium Training";
        String str2 = "Welocm to Hcl Technologies";
        String str3 =null;

        String[] Fruits = {"apple","orange","mango"};
        String[] Vegs = {"tomoto","pototo","onion"};


        assertEquals(str1,str1);
        assertNotEquals(str1,str2);
        assertSame(str1,str1);
        assertNotSame(str1,str2);
        assertNull(str3);
        assertNotNull(str2);
        assertTrue(str2.length() < str1.length());
        assertFalse(str2.length() <str2.length());
        assertArrayEquals(Fruits,Fruits);

    }


}
