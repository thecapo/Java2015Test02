package org.bhi.q3;

import java.util.Date;

/**
 *
 * @author carlo nino mabalatan
 */
public class OnLineRegistration extends Registration {

    private String email;

    public OnLineRegistration(String email, int regid, String regdescription, Date regdate) {
        super(regid, regdescription, regdate);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
