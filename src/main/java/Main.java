public class Main {
    public static void main(String[] args) {


        Student kai = new Student();
        kai.setBirthYear(2005) ;
        kai.setFirstName("Kai")  ;
        kai.setSecondName("Voss");
        kai.setStreet("Strassenname 14");
        kai.setCity("Kleinstadt");
        kai.setPostalCode("D-50555");
        System.out.println(kai.getName());
        System.out.println(kai.getAdress());

    }


}
