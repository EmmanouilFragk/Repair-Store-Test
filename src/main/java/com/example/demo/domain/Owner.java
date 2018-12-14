package com.example.demo.domain;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "OWNER")
public class Owner {
    private static final int MAX_NAME_LENGTH  = 50;

    @Id
    @Column(name = "owner_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tax_reg_num", length = MAX_NAME_LENGTH)
    private String taxRegistrationNumber;

    @Column(name = "firstname", length = MAX_NAME_LENGTH)
    private String firstName;

    @Column(name = "lastname", length = MAX_NAME_LENGTH)
    private String lastName;

    @Column(name = "address", length = MAX_NAME_LENGTH)
    private String address;

    @Column(name = "email", length = MAX_NAME_LENGTH)
    private String email;

    @Column(name = "password", length = MAX_NAME_LENGTH)
    private String password;

    @Column(name = "car_brand", length = MAX_NAME_LENGTH)
    private String carBrand;

    @Column(name = "car_plate", length = MAX_NAME_LENGTH)
    private String carPlate;

    @Column(name = "user_type", length = MAX_NAME_LENGTH)
    private String userType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaxRegistrationNumber() {
        return taxRegistrationNumber;
    }

    public void setTaxRegistrationNumber(String taxRegistrationNumber) {
        this.taxRegistrationNumber = taxRegistrationNumber;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", taxRegistrationNumber='" + taxRegistrationNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", carPlate='" + carPlate + '\'' +
                '}';
    }


    //@OneToMany(mappedBy = "author", targetEntity = Book.class)
    //private List<Book> books;

}
