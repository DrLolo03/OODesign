package edu.escuelaing.arsw;

import java.io.File;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class OODesignTest 
    extends TestCase
{
    /**
     * Constructor OODesignTest
     */
    public OODesignTest(){
    }
    
    public void testColumna1Mean(){
        File file = new File("./Resources/Columna1.txt");
        assertTrue(OODesign.mean(file)==550.6);
    }

    public void testColumna1ST(){
        File file = new File("./Resources/Columna1.txt");
        assertTrue(OODesign.standardDeviation(file)==572.03);
    }

    public void testColumna2Mean(){
        File file = new File("./Resources/Columna2.txt");
        assertTrue(OODesign.mean(file)==60.32);
    }

    public void testColumna2ST(){
        File file = new File("./Resources/Columna2.txt");
        assertTrue(OODesign.standardDeviation(file)==62.26);
    }

}
