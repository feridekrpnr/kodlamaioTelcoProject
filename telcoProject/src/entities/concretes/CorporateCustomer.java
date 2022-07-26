package entities.concretes;

import java.util.List;

public class CorporateCustomer extends Customer {
    private String companyName;
    private String taxNo;

    public CorporateCustomer(int id, String customerNumber, List<Subscription> subscriptions, List<Address> addresses, String companyName, String taxNo) {
        super(id, customerNumber, subscriptions, addresses);
        this.companyName = companyName;
        this.taxNo = taxNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }
}
