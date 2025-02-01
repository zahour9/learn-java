import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class datesIntersection {
    public static Boolean datesIntersectionMethod(String period1, String period2) throws ParseException{ //period syntax: dd/mm/yyyy-dd/mm/yyyy
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String[] period1Arr = period1.split("-");
        String[] period2Arr = period2.split("-");
        Date startDate1 = simpleDateFormat.parse(period1Arr[0]);
        Date endDate1 = simpleDateFormat.parse(period1Arr[1]);
        Date startDate2 = simpleDateFormat.parse(period2Arr[0]);
        Date endDate2 = simpleDateFormat.parse(period2Arr[1]);
        Boolean output = false;
        if(endDate1.after(startDate2) && endDate1.before(endDate2) ){
            output = true;
        }
        if(endDate2.after(startDate1) && endDate2.before(endDate1)){
            output = true;
        }
        if(startDate1.after(startDate2) && startDate1.before(endDate2)){
            output = true;
        }
        if(startDate2.after(startDate1) && startDate2.before(endDate1)){
            output = true;
        }
        return output;
    }
    public static void main(String[] args) {
        try {
            System.out.println(datesIntersectionMethod("01/01/2020-01/02/2020", "0"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
