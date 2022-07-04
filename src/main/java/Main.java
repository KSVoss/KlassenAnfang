import model.Student;
import model.StudentDB;

public class Main {
    public static void main(String[] args) {


        Student eva = new Student("Eva","Klein",1);
        Student kai = new Student("Kai","Voss",2);
        Student paula=new Student("Paula","Hase",3);
        Student[] allStudents ={eva,kai,paula};
        StudentDB cgn_java_22= new StudentDB(allStudents);
       // System.out.println(allStudents[0]);
       // System.out.println(allStudents[1]);
       // System.out.println(allStudents[2]);
        System.out.println(cgn_java_22.toString());


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
