import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(int a, int b) {
        Map<Integer, String> days = new HashMap();
        days.put(0, "SUN");
        days.put(1, "MON");
        days.put(2, "TUE");
        days.put(3, "WED");
        days.put(4, "THU");
        days.put(5, "FRI");
        days.put(6, "SAT");

        LocalDate localDate = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        return days.get(dayOfWeek.getValue());
    }
}