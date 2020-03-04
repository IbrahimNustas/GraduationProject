package com.example.graduationproject;

public class Test {

    String testID;
    String patientID;
    String date;
    String file;
    String testType;
    String doctorID;
    String techID;
    String nurseID;
    String location;
    String reportID;
    Boolean approvedBool;

    public Test(String testID, String patientID, String date, String file, String testType, String doctorID, String techID, String nurseID, String location, String reportID, Boolean approvedBool) {
        this.testID = testID;
        this.patientID = patientID;
        this.date = date;
        this.file = file;
        this.testType = testType;
        this.doctorID = doctorID;
        this.techID = techID;
        this.nurseID = nurseID;
        this.location = location;
        this.reportID = reportID;
        this.approvedBool = approvedBool;
    }

    public String getTestID() {
        return testID;
    }

    public void setTestID(String testID) {
        this.testID = testID;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public String getTechID() {
        return techID;
    }

    public void setTechID(String techID) {
        this.techID = techID;
    }

    public String getNurseID() {
        return nurseID;
    }

    public void setNurseID(String nurseID) {
        this.nurseID = nurseID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getReportID() {
        return reportID;
    }

    public void setReportID(String reportID) {
        this.reportID = reportID;
    }

    public Boolean getApprovedBool() {
        return approvedBool;
    }

    public void setApprovedBool(Boolean approvedBool) {
        this.approvedBool = approvedBool;
    }

    @Override
    public String toString() {
        return "Test{" +
                "testID='" + testID + '\'' +
                ", patientID='" + patientID + '\'' +
                ", date='" + date + '\'' +
                ", file='" + file + '\'' +
                ", testType='" + testType + '\'' +
                ", doctorID='" + doctorID + '\'' +
                ", techID='" + techID + '\'' +
                ", nurseID='" + nurseID + '\'' +
                ", location='" + location + '\'' +
                ", reportID='" + reportID + '\'' +
                ", approvedBool=" + approvedBool +
                '}';
    }
}
