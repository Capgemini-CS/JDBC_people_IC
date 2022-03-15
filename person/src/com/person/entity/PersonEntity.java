package com.person.entity;

public class PersonEntity {

    private int personId;
    private String firstName;
    private String lastName;
    private int age;
    private String cnp;
    private int addressId;
    private int jobId;


    public PersonEntity(int personId, String firstName, String lastName, int age, String cnp, int addressId, int jobId) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.cnp = cnp;
        this.addressId = addressId;
        this.jobId = jobId;
    }

    public PersonEntity() {

    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    @Override
    public String toString() {
        return "PersonEntity{" +
                "personId=" + personId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", cnp='" + cnp + '\'' +
                ", addressId=" + addressId +
                ", jobId=" + jobId +
                '}';
    }
}
