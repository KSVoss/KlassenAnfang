import model.Student;

public class Main {
    public static void main(String[] args) {


        Student eva = new Student("Eva","Klein");
        Student kai = new Student();
        Student paula=new Student("Eva","Klein");
        /*kai.setBirthYear(2005) ;
        kai.setFirstName("Kai")  ;
        kai.setSecondName("Voss");
        kai.setStreet("Strassenname 14");
        kai.setCity("Kleinstadt");
        kai.setPostalCode("D-50555");
        System.out.println(kai.getName());
        System.out.println(kai.getAdress());

        System.out.println((eva.getName()));
        System.out.println((kai));
        System.out.println(("Alle Daten von Kai:"+kai));
        */
        if(eva.equals(paula)){

            System.out.println("Sind gleich");
        }
        else {
            System.out.println("Sind nicht glecih");
        }
    }


}
