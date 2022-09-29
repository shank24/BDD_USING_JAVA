package bdd.stepDefinitions;

import io.cucumber.java.en.Given;

import java.util.List;

public class DataTableDefs {

    @Given("my credentials")
    public void myCredentials(List<List<String>> creds){
        System.out.println("Row 0 Username = " + creds.get(0).get(0));
        System.out.println("Row 0 Password = " + creds.get(0).get(1));
        System.out.println("Row 1 Username = " + creds.get(1).get(0));
        System.out.println("Row 1 Password = " + creds.get(1).get(1));


    }
}
