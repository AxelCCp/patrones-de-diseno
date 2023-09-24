package com.builder;

import com.builder.domain.Address;
import com.builder.domain.Contact;
import com.builder.domain.Phone;
import javafx.util.Builder;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee.EmployeeBuilder()

                .setAge(24)
                .setName("Axel")
                .setGender("Male")

                .setAddress(new Address("Calle 9", "Medellín", "Colombia", "050030"))
                .setAddress("Calle 90", "Medellín", "Colombia", "050032")

                .setPhone(new Phone("1234123", "1002", "fijo"))
                .setPhone("1234123", null, "celular")

                .setContact(
                        new Contact("Boo",
                        new Phone("27438", null, "celular"),
                        new Address("Calle 90", "Medellín", "Colombia", "050032")))

                .build();

        System.out.println(employee);

    }
}