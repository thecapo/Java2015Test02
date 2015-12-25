package org.bhi.q3;

import java.util.Date;

/**
 *
 * @author carlo nino mabalatan
 */
public abstract class Registration {

    private int regid;
    private String regdescription;
    private Date regdate;

    public Registration(int regid, String regdescription, Date regdate) {
        this.regid = regid;
        this.regdescription = regdescription;
        this.regdate = regdate;
    }

    public int getRegid() {
        return regid;
    }

    public void setRegid(int regid) {
        this.regid = regid;
    }

    public String getRegdescription() {
        return regdescription;
    }

    public void setRegdescription(String regdescription) {
        this.regdescription = regdescription;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

}
