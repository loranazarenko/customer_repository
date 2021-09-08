package com.example.customerRep.dto;

public class CustomerDto {

    private Long id;
    private String code;
    private int isDeleted;
    private String firstName;
    private String lastName;


    public CustomerDto() {
    }

    public CustomerDto(Long id, String code, int isDeleted, String firstName, String lastName) {
        this.id = id;
        this.code = code;
        this.isDeleted = isDeleted;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
}
