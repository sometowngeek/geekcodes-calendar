package org.geekcodes.calendar.models.month;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The abstract class AMONTH.
 */
abstract class AMonth implements IMonth {
    protected final java.time.Month month;
    protected       LocalDate       localDate;
    
    protected AMonth(java.time.Month month) {
        this.month = month;
    }
    
    /**
     * Get calendar calendar.
     *
     * @return the calendar
     */
    protected final LocalDate getLocalDate() {
        return this.localDate;
    }
    
    /**
     * Sets calendar.
     *
     * @param localDate the calendar
     */
    protected final void setLocalDate(LocalDate localDate) {
        this.localDate = LocalDate.ofEpochDay(localDate.toEpochDay());
    }
    
    /**
     * Gets dates.
     *
     * @return the dates
     */
    @Override
    public final List<LocalDate> getDates() {
        if (this.localDate.getMonth() == java.time.Month.DECEMBER) {
            return this.localDate.withDayOfMonth(1).datesUntil(LocalDate.of(this.localDate.getYear()+1, java.time.Month.JANUARY, 1)).collect(Collectors.toList());
        }
        
        return this.localDate.withDayOfMonth(1).datesUntil(LocalDate.of(this.localDate.getYear(), this.localDate.getMonthValue() + 1, 1)).collect(Collectors.toList());
    }
    
}
