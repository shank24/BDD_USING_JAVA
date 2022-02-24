package bdd.customtype;

import bdd.domainobjects.BillingDetails;
import io.cucumber.java.DataTableType;
import java.util.Map;


public class CustomDataTableType {
    @DataTableType
    public BillingDetails billingDetailsEntry(Map<String, String> entry){
        return new BillingDetails(entry.get("firstname"),
                entry.get("lastname"),
                entry.get("address"),
                entry.get("city"),
                entry.get("state"),
                entry.get("zip"),
                entry.get("email"));
    }

}
