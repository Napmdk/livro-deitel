package view;

import model.Date;

import static model.Date.formataData;

public class DateView {

    public static void displayDate(Date date) {
        System.out.printf("%s/%s/%s", formataData(date.getMes()), formataData(date.getDia()), date.getAno());
    }

}
