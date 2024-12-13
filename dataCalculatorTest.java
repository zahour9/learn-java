import org.junit.Test;
import static org.junit.Assert.*;
public class dataCalculatorTest {
    @Test 
    public void testDate(){
        assertEquals(dateCalculator.dateMethod("8/10/2024", "4/04/2024", true), "Start date is bigger than end date");
        assertEquals(dateCalculator.dateMethod("8/1/2024", "12/04/2024", false), "The number of days between 8/1/2024 and 12/04/2024 is: 69");
        assertEquals(dateCalculator.dateMethod("8/1/2024", "12/04/2024", true), "The number of days between 8/1/2024 and 12/04/2024 is: 95");
        assertEquals(dateCalculator.dateMethod("8/14/2024", "2024", true), "Date form should be like that: dd/MM/yyyy");
        assertEquals(dateCalculator.dateMethod("0/0/2023", "1/2/2023", true), "Date form should be like that: dd/MM/yyyy");
        assertEquals(dateCalculator.dateMethod("5/1/2012", "6/7/2013", true), "The number of days between 5/1/2012 and 6/7/2013 is: 548");
    }
}
