package com.example.graduationproject;

public class Patient {
    String patientID;
    String Email;
    String dateOfBirth;
    String password;
    String name;
    String gender;
    String phoneNumber;
    String address;
    String allergy;
    Boolean admittedBool;
    String admissionID;

    public Patient(String patientID, String email, String dateOfBirth, String password, String name, String gender, String phoneNumber, String address, String allergy, Boolean admittedBool, String admissionID) {
        this.patientID = patientID;
        Email = email;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.allergy = allergy;
        this.admittedBool = admittedBool;
        this.admissionID = admissionID;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public Boolean getAdmittedBool() {
        return admittedBool;
    }

    public void setAdmittedBool(Boolean admittedBool) {
        this.admittedBool = admittedBool;
    }

    public String getAdmissionID() {
        return admissionID;
    }

    public void setAdmissionID(String admissionID) {
        this.admissionID = admissionID;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientID='" + patientID + '\'' +
                ", Email='" + Email + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", allergy='" + allergy + '\'' +
                ", admittedBool=" + admittedBool +
                ", admissionID='" + admissionID + '\'' +
                '}';
    }
}
