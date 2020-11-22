package com.thoughtworks.capability.gtb;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    int year = date.getYear();
    LocalDate laborDayInSameYear = LocalDate.of(year, 5, 1);
    LocalDate laborDay;
    if (date.isAfter(laborDayInSameYear)) {
      laborDay = LocalDate.of(year + 1, 5, 1);
    } else {
      laborDay = laborDayInSameYear;
    }
    return ChronoUnit.DAYS.between(date, laborDay);
  }
}
