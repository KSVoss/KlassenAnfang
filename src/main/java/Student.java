public class Student {
    private String firstName;
    private String secondName;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private String city;
    private String street;
    private String postalCode;
    private String courseName;

    public String getFirstName() {
        return firstName;
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
