package com.example.programacaoweb06032025;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

private String street;
private String city;
private String state;
private String zipCode;
}
