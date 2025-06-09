package ly.dataStructures.sparsearry;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo02 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate after100Days = today.plusDays(100);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = after100Days.format(formatter);
        System.out.println("当前日期: " + today.format(formatter));
        System.out.println("100天后的日期: " + formattedDate);
    }
}
