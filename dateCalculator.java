import java.time.*;
import java.time.temporal.ChronoUnit;
import java.text.SimpleDateFormat;

public class dateCalculator {
    public static boolean dateIsValid(String date) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
            try {
              format.parse(date);  
            } catch (Exception e) {
                return false;
            }
        return true;    
    }
    public static String dateMethod(String a, String b, boolean weekend){
        String output = "Date form should be like that: dd/MM/yyyy";
        String[] arr1 = new String[3];
        String[] arr2 = new String[3];
        int[] startDateArr = new int[arr1.length];
        int[] endDateArr = new int[arr2.length];
        long numberOfDays;
        if(dateIsValid(a) && dateIsValid(b)){
            arr1 = a.split("/");
            arr2 = b.split("/");
           for(int i = 0; i < arr1.length; i++){
            startDateArr[i] = Integer.parseInt(arr1[i]);
            endDateArr[i] = Integer.parseInt(arr2[i]);
        } 
        LocalDate startDate = LocalDate.of(startDateArr[2], startDateArr[1], startDateArr[0]);
        LocalDate endDate = LocalDate.of(endDateArr[2], endDateArr[1], endDateArr[0]);
        if(weekend == true){
        numberOfDays = ChronoUnit.DAYS.between(startDate, endDate);
        }
        else {
        long weeks = ChronoUnit.WEEKS.between(startDate, endDate);
        numberOfDays = ChronoUnit.DAYS.between(startDate, endDate) - weeks * 2;
        }
        output = "The number of days between " + a + " and "  + b + " is: " + numberOfDays;
        if(numberOfDays < 0 ) {
            output = "Start date is bigger than end date";
        }
        }
        else {
            return output;
        }

        return output;
    }
     public static void main(String[] args) {
       System.out.println(dateMethod("29/2/2024", "29/11/2024", false));
    }
}
