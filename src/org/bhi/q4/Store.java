package org.bhi.q4;

/**
 *
 * @author carlo nino mabalatan
 */
public class Store {

    private int storeID;
    private String address;
    private String phoneno;

    public Store(int storeID, String address, String phoneno) {
        this.storeID = storeID;
        this.address = address;
        this.phoneno = phoneno;
    }

    public int getStoreID() {
        return storeID;
    }

    public void setStoreID(int storeID) {
        this.storeID = storeID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

}
