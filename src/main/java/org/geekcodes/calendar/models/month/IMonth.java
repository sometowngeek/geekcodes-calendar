package org.geekcodes.calendar.models.month;

import java.time.LocalDate;
import java.util.List;

public interface IMonth {
    /**
     * Gets holidays.
     *
     * @return the holidays
     */
    List<LocalDate> getHolidays();
    
    /**
     * Gets dates.
     *
     * @return the dates
     */
    List<LocalDate> getDates();
}
