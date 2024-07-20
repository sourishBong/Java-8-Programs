import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Java8DataTime {

    public static void main(String args[]){

        //current dateTime
        LocalDateTime current=LocalDateTime.now();
        System.out.println(current);

        //current date
        System.out.println(LocalDate.now());

        //current time
        System.out.println(LocalTime.now());
    }
}
