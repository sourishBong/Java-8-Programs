import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeOfPersonInYears {

    public static void main(String[] args) {

        LocalDate birthday=LocalDate.of(1992,04,30);
        LocalDate today=LocalDate.now();

        System.out.println(ChronoUnit.YEARS.between(birthday,today));
    }
}
