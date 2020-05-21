/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author adria
 */
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;
import java.util.spi.CurrencyNameProvider;

public class Info {
    public Info() {
        String baseName = "res.Messages";
        Locale l = Locale.getDefault();
        ResourceBundle messages = ResourceBundle.getBundle(baseName, l);
        System.out.println(messages.getString("info"));
        System.out.println(messages.getString("country")+" "+l.getDisplayCountry());
        System.out.println(messages.getString("language")+" "+l.getDisplayLanguage());
        System.out.println(messages.getString("currency")+" "+Currency.getInstance(l));
        String[] weekDays = new DateFormatSymbols(l).getWeekdays();
        System.out.println(messages.getString("weekdays")+" "+Arrays.toString(weekDays));
        String[] months=new DateFormatSymbols(l).getMonths();
        System.out.println(messages.getString("months")+" "+Arrays.toString(months));
        LocalDateTime today=LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter
                .ofLocalizedDate(FormatStyle.FULL)
                .withLocale(l);
        System.out.println(messages.getString("today")+" "+today.format(formatter));
    }
}
