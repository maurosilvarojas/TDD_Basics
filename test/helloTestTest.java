import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by regga on 13/10/2016.
 */
public class helloTestTest {


    @Test
    public void getName() throws Exception {

    }

    @Test
    public void sqFunction() throws Exception {
        helloTest preD = new helloTest("Joe");//some
        assertEquals(25,preD.sqFunction(5));
    }

    @Test
    public void main() throws Exception {
        helloTest preD = new helloTest("Joe");
        assertEquals("Joe",preD.getName());
    }

}