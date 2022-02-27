package bdd.customtype;

import bdd.domainobjects.Product;
import io.cucumber.java.ParameterType;

public class CustomParameterType {

    // method name should match, what we are going to pass in the arg.
    // product
    @ParameterType(".*")
    public Product product(String name){

    }
}
