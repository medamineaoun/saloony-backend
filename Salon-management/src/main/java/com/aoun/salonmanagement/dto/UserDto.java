package com.aoun.salonmanagement.dto;

public class UserDto {
    private String userFirstName;
    private String userLastName;
    private String userGender;
    private String userEmail;
    private String userPhoneNumber;
    private String userName;
    private String userPassword;
    private String userRole;

    public UserDto(String userFirstName, String userLastName, String userGender, String userEmail, String userPhoneNumber, String userName, String userPassword, String userRole) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userGender = userGender;
        this.userEmail = userEmail;
        this.userPhoneNumber = userPhoneNumber;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userRole = userRole;
    }

    public UserDto() {
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}
