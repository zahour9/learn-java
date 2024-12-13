import org.junit.Test;
import static org.junit.Assert.*;

public class learningJavaTest {
    public boolean isEven(double num){
        if(num % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
    @Test
    public void testGetBigNum(){
        double[] array = {3, 8.2, -9, 6};
        assertEquals(learningJava.getBigNum(array), 6, 0.0001);
        assertEquals(isEven(learningJava.getBigNum(array)), true);
}
}
