import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class BuggyWidgetTest {

    private BuggyWidget buggyWidget;

    @Before
    public void setUp(){
        buggyWidget = new BuggyWidget();
    }

    @Test
    public void testTooBigIndex(){
        int firstElement = 1;
        ArrayList<Integer> myArray = new ArrayList<>();
        myArray.add(firstElement);
        buggyWidget.getNthElement(myArray, firstElement);
    }

    @Test
    public void testNothingButAHandle(){
        int firstElement = 1;
        ArrayList<Integer> myArray = null;
        buggyWidget.getNthElement(myArray, firstElement);
    }

    @Test
    public void testForever(){
        buggyWidget.forever();
    }

    @Test
    public void testMemoryHeavyStuff(){
        buggyWidget.useALotOfMemory();
    }

    @Test
    public void testTooYoungToBuyABeer(){
        int age = -5;
        buggyWidget.isAdult(age);
    }

    @Test
    public void testDodgyMath(){
        buggyWidget.divide( 0,  0);
    }

    @Test
    public void raisingToPower(){
        assertEquals(buggyWidget.power(0, -5), 5.0, 0.001);
    }

}
