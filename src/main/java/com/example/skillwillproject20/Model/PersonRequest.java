package com.example.skillwillproject20.Model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class PersonRequest {


    @NotNull(message = "firstname not be null")
    @NotBlank(message = "Idnumber not be blank")
    private String firstName;
    @NotNull(message = "lastname not be null")
    @NotBlank(message = "Idnumber not be blank")
    private String lastName;

    @NotBlank(message = "Idnumber not be blank")
    @NotNull(message = "age not be null")
    @Size(min = 1, max = 100, message = "You need to write 9 number")
    private String age;
    @NotBlank(message = "Idnumber not be blank")
    @NotNull(message = "Idnumber not be null")
    @Size(min = 0, max = 9, message = "You need to write 9 number")
    private String IDNumber;

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }
}
