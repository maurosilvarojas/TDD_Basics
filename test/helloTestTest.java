import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by regga on 13/10/2016.
 */
public class helloTestTest {


    @Test
    public void getName() throws Exception {
        helloTest newHello = new helloTest();
        assertEquals("James",newHello.getName("James"));
    }

    @Test
    public void sqFunction() throws Exception {
        helloTest cuadrado = new helloTest();//some
        assertEquals(144,cuadrado.timesFunction(12,2));
    }



    @Test
    public void main() throws Exception {

    }

    @Test
    public void addFunction() throws Exception {

    }
}