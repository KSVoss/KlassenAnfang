import model.Student;
import model.StudentDB;

public class Main {
    public static void main(String[] args) {


        Student eva = new Student("Eva","Klein",1);
        Student kai = new Student("Kai","Voss",2);
        Student paula=new Student("Paula","Hase",3);
        Student[] allStudents ={eva,kai,paula};
        Student[] allStudentsFromDB;
        StudentDB cgn_java_22= new StudentDB(allStudents);

        System.out.println(cgn_java_22.toString());
        allStudentsFromDB= cgn_java_22.getAllStudents();

        /* liefert random verschiedene Studenten?
        for(int i=0;i<30;i++){
            System.out.println(cgn_java_22.randomStudent().toString());
        }
        */

        Student klaus=new Student("Klaus","Schneider",4);
         System.out.println(cgn_java_22.toString());
        cgn_java_22.add(klaus);
         System.out.println(cgn_java_22.toString());
        cgn_java_22.remove(paula);
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

    }


}
