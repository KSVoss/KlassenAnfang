package model;

import java.util.Objects;

public class Student {
    private String firstName;
    private String secondName;
    private int studentID;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private String city;
    private String street;
    private String postalCode;
    private String courseName;

    public Student(){};
    public Student (String firstName,String secondName,int studentId){
        this.firstName=firstName;
        this.secondName=secondName;
        this.studentID=studentId;
    }
    public Student(String firstName, String secondName){
        this.firstName=firstName;
        this.secondName=secondName;
    }

    @Override
    public String toString(){
        String returnValue;
        return "Name:"+this.getName();
      }

      public int getId(){
        return this.studentID;
      }
    public String getFirstName() {
        return firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(secondName, student.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public int age(){
        return 2022-this.birthYear;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setStreet(String street){
        this.street=street;
    }
    public  void setPostalCode(String postalCode){
        this.postalCode=postalCode;
    }
    public String getAdress(){
        return this.street+"\n"+this.postalCode+" "+this.city;
    }
    public String getName(){
        return this.firstName+" "+this.secondName;
    }
}
