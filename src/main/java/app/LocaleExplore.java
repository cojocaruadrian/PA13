/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author adria
 */
import com.DisplayLocales;
import com.Info;
import com.SetLocale;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LocaleExplore {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String baseName = "res.Messages";
        while(true){
            Locale l = Locale.getDefault();
            ResourceBundle messages = ResourceBundle.getBundle(baseName, l);
            System.out.println(messages.getString("prompt"));
            String command = s.nextLine();
            if(command.equals("Info")){
                new Info();
            }else if(command.equals("DisplayLocales")){
                new DisplayLocales();
            }else if(command.equals("SetLocale")){
                System.out.println("Locale: ");
                System.out.println("1. ro");
                System.out.println("2. en");
                System.out.println(messages.getString("choice"));
                String option = s.nextLine();
                String locale;
                if(option.equals("1")){
                    locale="ro-RO";
                }else locale="en-US";
                new SetLocale(locale);
            }else if(command.equals("Exit")){
                System.out.println(messages.getString("bye"));
                break;
            }else System.out.println(messages.getString("invalid"));
        }

    }
}
