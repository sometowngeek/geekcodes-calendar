package org.geekcodes.calendar.models.month;

import org.geekcodes.calendar.utilities.LocalDateUtility;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * The type November.
 */
public class November extends AMonth implements IMonth {
    private November() {
        super(Month.NOVEMBER);
    }

    /**
     * Instantiates a new November.
     *
     * @param year the year
     */
    public November(int year){
        this();
        this.localDate = LocalDate.of(year, Month.NOVEMBER, 1);
    }

    /**
     * Get dates list.
     *
     * @param year the year
     * @return the list
     */
    public static List<LocalDate> getDates(int year){
        return new November(year).getDates();
    }

    /**
     * Get thanksgiving local date.
     *
     * @param year the year
     * @return the local date
     */
    public static LocalDate getThanksgiving(int year){
        return new November(year).getThanksgiving();
    }

    /**
     * Get holidays list.
     *
     * @param year the year
     * @return the list
     */
    public static List<LocalDate> getHolidays(int year){
        return new November(year).getHolidays();
    }

    /**
     * Get thanksgiving local date.
     *
     * @return the local date
     */
    public LocalDate getThanksgiving(){
        return LocalDateUtility.getLastDay(this.localDate, DayOfWeek.THURSDAY);
    }

    /**
     * Get holidays list
     *
     * @return the list
     */
    @Override
    public List<LocalDate> getHolidays() {
        List<LocalDate> holidays = new ArrayList<>();
        holidays.add(getThanksgiving());

        return holidays;
    }
}
