package bdd.stepDefinitions;

import bdd.domainobjects.Customer;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;

import java.util.List;

public class DataTableDefs {

    @DataTableType
    public Customer customerEntry(List<String> entry){
        return new Customer(entry.get(0), entry.get(1));
    }

    @Given("my credentials")

    public void myCredentials(List<Customer> customers){
        System.out.println("Username 0 = " + customers.get(0).getUsername());
        System.out.println("Password 0 = " + customers.get(0).getPassword());

        System.out.println("Username 1 = " + customers.get(1).getUsername());
        System.out.println("Password 1 = " + customers.get(1).getPassword());
    }

    /*public void myCredentials(List<List<String>> creds){
        System.out.println("Row 0 Username = " + creds.get(0).get(0));
        System.out.println("Row 0 Password = " + creds.get(0).get(1));
        System.out.println("Row 1 Username = " + creds.get(1).get(0));
        System.out.println("Row 1 Password = " + creds.get(1).get(1));


    }*/
}
