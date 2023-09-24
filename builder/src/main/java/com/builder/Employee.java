package com.builder;

import com.builder.domain.Address;
import com.builder.domain.Contact;
import com.builder.domain.Phone;

import java.util.ArrayList;
import java.util.List;

public class Employee {


    public Employee() {
    }

    public Employee(int age, String name, String gender, Address address, List<Phone> phoneList, List<Contact> contactList) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phoneList = phoneList;
        this.contactList = contactList;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address=" + address +
                ", phoneList=" + phoneList +
                ", contactList=" + contactList +
                '}';
    }

    private int age;
    private String name;
    private String gender;
    private Address address;
    private List<Phone>phoneList;
    private List<Contact>contactList;



    //---------------------------------------------------------------------------

    public static class EmployeeBuilder implements Builder<Employee>{

        public EmployeeBuilder() {}

        public EmployeeBuilder setName(String name){
            this.name = name;
            return this;                                                                                                //this : se devuelve el obj actual.
        }

        public EmployeeBuilder setGender(String gender){
            this.gender = gender;
            return this;
        }

        public EmployeeBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public EmployeeBuilder setAddress(Address address ){                                                            //manera 1
            this.address = address;
            return this;
        }

        public EmployeeBuilder setAddress(String address, String city, String country, String cp){                      //manera 2
            this.address = new Address(address, city, country, cp);
            return this;
        }

        public EmployeeBuilder setPhone(Phone phone){                                                                   //manera 1
            this.phoneList.add(phone);
            return this;
        }

        public EmployeeBuilder setPhone(String phoneNumber, String extension, String type){                             //manera 2
            this.phoneList.add(new Phone(phoneNumber, extension, type));
            return this;
        }

        public EmployeeBuilder setContact(Contact contact){                                                             //manera 1
            this.contactList.add(contact);
            return this;
        }

        public EmployeeBuilder setContact(String name, Phone phone, Address address){                                  //manera 2
            this.contactList.add(new Contact(name, phone, address));
            return this;
        }


        @Override
        public Employee build() {                                                                                       //construye los obj
            return new Employee(age, name, gender, address, phoneList, contactList);
        }


        private int age;
        private String name;
        private String gender;
        private Address address;
        private List<Phone>phoneList = new ArrayList<>();
        private List<Contact>contactList = new ArrayList<>();
    }

}
