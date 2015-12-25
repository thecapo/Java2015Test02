package org.bhi.q3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author carlo nino mabalatan
 */
public class TestRegistration {

    public static void main(String[] args) {

        List<FormRegistration> formregistration = new ArrayList<>();
        List<OnLineRegistration> onlineregistration = new ArrayList<>();

        Calendar cal1 = Calendar.getInstance();
        cal1.set(2015, 11, 16, 9, 0, 0);
        Date regdate = cal1.getTime();

        FormRegistration john1 = new FormRegistration(7.5f, 1144, "PHPCon", regdate);
        FormRegistration john2 = new FormRegistration(7.5f, 1155, "PHPCon", regdate);

        OnLineRegistration doe1 = new OnLineRegistration("john@bhi.org.au", 3455, "PHPCon", regdate);
        OnLineRegistration doe2 = new OnLineRegistration("paul@swin.edu.au", 3456, "PHPCon", regdate);
        OnLineRegistration doe3 = new OnLineRegistration("george@monash.edu.au", 3457, "PHPCon", regdate);

        formregistration.add(john1);
        formregistration.add(john2);

        onlineregistration.add(doe1);
        onlineregistration.add(doe2);
        onlineregistration.add(doe3);

        for (OnLineRegistration temponlineregistration : onlineregistration) {
            System.out.println("Email Addresses of  On-Line Registration : " + temponlineregistration.getEmail());
        }

    }
}
