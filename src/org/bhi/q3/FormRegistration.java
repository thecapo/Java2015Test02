package org.bhi.q3;

import java.util.Date;

/**
 *
 * @author carlo nino mabalatan
 */
public class FormRegistration extends Registration {

    private float adminfee;

    public FormRegistration(float adminfee, int regid, String regdescription, Date regdate) {
        super(regid, regdescription, regdate);
        this.adminfee = adminfee;
    }

    public float getAdminfee() {
        return adminfee;
    }

    public void setAdminfee(float adminfee) {
        this.adminfee = adminfee;
    }

}
