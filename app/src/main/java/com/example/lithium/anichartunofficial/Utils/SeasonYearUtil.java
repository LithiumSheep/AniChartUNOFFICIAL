package com.example.lithium.anichartunofficial.Utils;

import java.util.Calendar;

public class SeasonYearUtil {

    //Winter DEC - FEB
    //Spring MAR - MAY
    //Summer JUN - AUG
    //Fall   SEP - NOV

    //current + 2 ahead + 1 recent

    public static int getCurrentYear() {
        Calendar c = Calendar.getInstance();
        return c.get(Calendar.YEAR);
    }

    public static String getCurrentSeason() {
        Calendar c = Calendar.getInstance();
        int month = c.get(Calendar.MONTH);

        if ((0 <= month && month <= 1) || month == 11) {
            return "Winter";
        } else if (2 <= month && month <= 4) {
            return "Spring";
        } else if (5 <= month && month <= 7){
            return "Summer";
        } else if (8 <= month && month <= 10) {
            return "Fall";
        }
        return "Error";
    }
}
