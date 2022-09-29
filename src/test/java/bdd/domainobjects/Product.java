package bdd.domainobjects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    public Product(String name) {
        this.name = name;
    }

    private String name;
}
