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
import java.util.Locale;
import java.util.ResourceBundle;

public class DisplayLocales {
    public DisplayLocales() {
        String baseName = "res.Messages";
        Locale l =Locale.getDefault();
        ResourceBundle messages =ResourceBundle.getBundle(baseName, l);
        System.out.println(messages.getString("locale.set"));
        System.out.println(Locale.getDefault().getDisplayCountry()+"\t"+Locale.getDefault().getDisplayLanguage());
        System.out.println(messages.getString("locales"));
        Locale available[] =
                Locale.getAvailableLocales();
        for(Locale locale : available) {
            System.out.println(locale.getDisplayCountry() + "\t" +
                    locale.getDisplayLanguage(locale));
        }
    }
}
