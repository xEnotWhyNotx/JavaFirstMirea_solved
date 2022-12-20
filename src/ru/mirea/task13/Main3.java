package ru.mirea.task13;

import java.util.StringTokenizer;

public class Main3 {
    public static void main(String[] args) {
        Address address = new Address();
        String test1 = "Russia, Central, Moscow, Arbatskaya, 31, 1, 14";
        String test2 = "Russia;   Central.   Moscow, Trofimova; 12, 4, 42";
        String test3 = "USA, Florida, Miami,  SomeStreet, 11, 1, 1";
        String test4 = "Russia;   Khanty-Mansi Autonomous District, Khanty-Mansiysk, Lenina, 12, 12, 12";
        address.buildAddress(test1);
        System.out.println(address);
        address.buildAddressWithTokens(test2);
        System.out.println(address);
        address.buildAddress(test3);
        System.out.println(address);
        address.buildAddressWithTokens(test4);
        System.out.println(address);
    }
}

class Address {
    String country;
    String region;
    String city;
    String street;
    String house;
    String building;
    String apartment;

    public void buildAddress(String address) {
        String[] fields = address.trim().split(",");
        country = fields[0].trim();
        region = fields[1].trim();
        city = fields[2].trim();
        street = fields[3].trim();
        house = fields[4].trim();
        building = fields[5].trim();
        apartment = fields[6].trim();
    }

    public void buildAddressWithTokens(String address) {
        StringTokenizer fields = new StringTokenizer(address, ",.;");
        country = fields.nextToken().trim();
        region = fields.nextToken().trim();
        city = fields.nextToken().trim();
        street = fields.nextToken().trim();
        house = fields.nextToken().trim();
        building = fields.nextToken().trim();
        apartment = fields.nextToken().trim();
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}
