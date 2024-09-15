package view;

import model.Date;

public class DateView {

    public static void displayDate(Date date) {
        System.out.printf("%s%s/%s%s/%s", Date.dateFormatMes(date.getMes()), date.getMes(),
                Date.dateFormatDia(date.getDia()), date.getDia(),
                date.getAno());
    }

}
