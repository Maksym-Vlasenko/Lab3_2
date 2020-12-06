package com.maksim.model;

public class Phone {
    private int id;
    private String firstName;
    private String lastName;
    private String middleName;
    private int accountNumber;
    private int inCityCallsMinutes;
    private int interCityCallsMinutes;

    public Phone(int id,
                 String firstName,
                 String lastName,
                 String middleName,
                 int accountNumber,
                 int inCityCallsMinutes,
                 int interCityCallsMinutes) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.accountNumber = accountNumber;
        this.inCityCallsMinutes = inCityCallsMinutes;
        this.interCityCallsMinutes = interCityCallsMinutes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getInCityCallsMinutes() {
        return inCityCallsMinutes;
    }

    public void setInCityCallsMinutes(int inCityCallsMinutes) {
        this.inCityCallsMinutes = inCityCallsMinutes;
    }

    public int getInterCityCallsMinutes() {
        return interCityCallsMinutes;
    }

    public void setInterCityCallsMinutes(int interCityCallsMinutes) {
        this.interCityCallsMinutes = interCityCallsMinutes;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", accountNumber=" + accountNumber +
                ", inCityCallsMinutes=" + inCityCallsMinutes +
                ", interCityCallsMinutes=" + interCityCallsMinutes +
                '}';
    }
}
