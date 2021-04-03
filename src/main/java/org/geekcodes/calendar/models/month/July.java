package org.geekcodes.calendar.models.month;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * The type July.
 */
public class July extends AMonth implements IMonth {
    private July() {
        super(Month.JULY);
    }
    
    /**
     * Instantiates a new July.
     *
     * @param year the year
     */
    public July(int year) {
        this();
        this.localDate = LocalDate.of(year, Month.JULY, 1);
    }
    
    /**
     * Get dates list.
     *
     * @param year the year
     *
     * @return the list
     */
    public static List<LocalDate> getDates(int year) {
        return new July(year).getDates();
    }
    
    /**
     * Gets fourth of july.
     *
     * @return the fourth of july
     */
    public LocalDate getFourthOfJuly() {
        return this.localDate.withDayOfMonth(4);
    }
    
    /**
     * Gets fourth of july.
     *
     * @param year the year
     *
     * @return the fourth of july
     */
    public static LocalDate getFourthOfJuly(int year) {
        return new July(year).getFourthOfJuly();
    }
    
    /**
     * Gets fourth of july observed.
     *
     * @return the fourth of july observed
     */
    public LocalDate getFourthOfJulyObserved() {
        LocalDate ld = this.localDate.withDayOfMonth(4);
        
        if (ld.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
            return ld.minusDays(1);
        }
        
        if (ld.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
            return ld.plusDays(1);
        }
        
        return ld;
    }
    
    /**
     * Gets fourth of july observed.
     *
     * @param year the year
     *
     * @return the fourth of july observed
     */
    public static LocalDate getFourthOfJulyObserved(int year) {
        return new July(year).getFourthOfJulyObserved();
    }
    
    /**
     * Gets holidays.
     *
     * @return the holidays
     */
    @Override
    public List<LocalDate> getHolidays() {
        List<LocalDate> holidays = new ArrayList<>();
        holidays.add(this.getFourthOfJuly());
        
        return holidays;
    }
    
    /**
     * Gets holidays.
     *
     * @param year the year
     *
     * @return the holidays
     */
    public static List<LocalDate> getHolidays(int year) {
        return new July(year).getHolidays();
    }
    
    /**
     * Gets holidays observed.
     *
     * @return the holidays observed
     */
    public List<LocalDate> getObservedHolidays() {
        List<LocalDate> holidays = new ArrayList<>();
        holidays.add(this.getFourthOfJulyObserved());
        
        return holidays;
    }
    
    /**
     * Gets holidays observed.
     *
     * @param year the year
     *
     * @return the holidays observed
     */
    public static List<LocalDate> getObservedHolidays(int year) {
        return new July(year).getObservedHolidays();
    }
}
