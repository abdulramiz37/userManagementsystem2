package com.example.userManagementSystem2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor
@Table(name = "user_table")
@Entity
public class User {
    @NotNull(message = "please enter user id")
    @Id
    @Column(name = "user_Id")
    private String UserId;

    @Column(name = "user_name")
    @NotNull(message = "please enter user name")
    private String UserName;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @NotNull(message = "please enter DOB")
    @Column(name = "date_of_birth")
    private String DateOfBirth;

    @NotNull(message = "please enter email id")
    @Column(name = "email")
    private String Email;

    @NotNull(message = "please enter phone number")
    @Size(max = 12, message = "should not be greater or less than 12")
    @Column(name = "phone_number")
    private String PhoneNumber;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @NotNull(message = "please enter date")
    @Column(name = "date")
    private String Date;

    @NotNull(message = "please enter time")
    @Column(name = "time")
    private String Time;

}
