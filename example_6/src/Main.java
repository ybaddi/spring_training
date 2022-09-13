import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZonedDateTime;

public class Main {

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.from(ZonedDateTime.now());
        LocalDateTime ldt2 = LocalDateTime.now();
        System.out.println("date et heur current is " + ldt2.toLocalDate());
        System.out.println("date et heur current is " + ldt2.toLocalTime());
        LocalDateTime ldt3 = LocalDateTime.of(1994, Month.JULY,23,01,30,12);
        System.out.println("date et heur current is " + ldt3);
        String strDate = "1994-07-23";
        LocalDate dateformated = LocalDate.parse(strDate);
        System.out.println(dateformated);
        System.out.println(ldt3.compareTo(ldt2));
    }
}


/*
LocalDateTime
LocalDate
LocalTime
ZonedDateTime

now() -> current date and time
of() -> instance of date and time of params
parser(str) -> get datetime instance from string
from(,,,) convert params to date Time
 */