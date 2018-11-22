package com.hamza.contacts;

public class Contact {
    private int id;
    private String firstName;
    private String lastName;
    private String company;
    private String phoneNumber;
    private String email;
    private String url;
    private String address;
    private String birthday;

   public  int getId(){
       return id;
   }

   public void setId(int id){
       this.id=id;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString(){
       return getId() + getFirstName() + getLastName() + getCompany() + getPhoneNumber() +getEmail() + getUrl()+ getEmail()+ getAddress() +getBirthday();
    }
}
