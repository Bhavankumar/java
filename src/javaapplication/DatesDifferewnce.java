/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bhosaman
 */
public class DatesDifferewnce {

    public static void main(String args[]) {

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);

            Date firstDate = sdf.parse("06/24/2017");

            Date secondDate = sdf.parse("06/29/2017");

            long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());

            long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.DAYS);

            System.out.println("Dates difference=" + diff);

        } catch (ParseException ex) {

            Logger.getLogger(DatesDifferewnce.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
