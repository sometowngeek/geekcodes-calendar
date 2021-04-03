package org.geekcodes.calendar.models.month;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

/**
 * The type December.
 */
public class December extends AMonth implements IMonth {
    /**
     * Private constructor
     */
    private December(){
        super(Month.DECEMBER);
    }

    /**
     * Instantiates a new December.
     *
     * @param year the year
     */
    public December(int year) {
        this();
        this.localDate = LocalDate.of(year, this.month, 1);
    }

    /**
     * Get dates list.
     *
     * @param year the year
     * @return the list
     */
    public static List<LocalDate> getDates(int year){
        return new December(year).getDates();
    }

    /**
     *
     */
    @Override
    public List<LocalDate> getHolidays() {
        return Arrays.asList(this.getChristmas());
    }

    /**
     * Get holidays list.
     *
     * @param year the year
     * @return the list
     */
    public static List<LocalDate> getHolidays(int year){
        return new December(year).getHolidays();
    }

    /**
     * Get christmas local date.
     *
     * @return the local date
     */
    public LocalDate getChristmas(){
        return LocalDate.of(this.localDate.getYear(), Month.DECEMBER, 25);
    }

    /**
     * Get christmas local date.
     *
     * @param year the year
     * @return the local date
     */
    public static LocalDate getChristmas(int year){
        return new December(year).getChristmas();
    }


}
