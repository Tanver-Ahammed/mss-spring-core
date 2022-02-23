package com.spring.core.p7.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {

    private List<String> friends;
    private Set<String> phones;
    private Map<String, Integer>feeStructure;
    private Properties properties;

    public Person() {
    }

    public Person(List<String> friends, Set<String>phones,
                  Map<String, Integer> feeStructure, Properties properties) {
        this.friends = friends;
        this.phones = phones;
        this.feeStructure = feeStructure;
        this.properties = properties;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Set<String> getPhones() {
        return phones;
    }

    public void setPhones(Set<String> phones) {
        this.phones = phones;
    }

    public Map<String, Integer> getFeeStructure() {
        return feeStructure;
    }

    public void setFeeStructure(Map<String, Integer> feeStructure) {
        this.feeStructure = feeStructure;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Person{\n" +
                "friends: " + friends +
                "\n" + friends.getClass() +
                "\nphones: " + phones +
                "\n" + phones.getClass() +
                "\nfeeStructure: " + feeStructure +
                "\n" + feeStructure.getClass() +
                "\nproperties: " + properties +
                "\n" + properties.getClass() +
                "\n}";
    }
}
