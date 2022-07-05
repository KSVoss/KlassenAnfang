package model;

public class StudentDB {
    private Student[] students;
    public StudentDB(Student[] students){
        this.students=students;


    }
    public Student[] getAllStudents() {
        return students;
    }
    //public void lenn(){
    //    System.out.println(students.length);
    //}
    public  void add(Student newStudent){
        if(newStudent==null)return;
        Student[] temporaryStudents=new Student[students.length+1];
        for(int i=0;i<students.length;i++){
            temporaryStudents[i]=students[i];
        }
        temporaryStudents[students.length]=newStudent;
        students=temporaryStudents;

    }
    public void remove(Student studentToRemove) {
        int howManyToRemove=0;
        for(int i=0;i<students.length;i++){
            if(students[i]==studentToRemove)howManyToRemove++;
        }
        if(howManyToRemove!=1)return;
        Student[] temporaryStudents = new Student[students.length - 1];
        int iterationTemporaryStudents = 0;



        for (int iterationStudents = 0; iterationStudents < students.length; iterationStudents++) {




            if (students[iterationStudents].equals(studentToRemove) == false) {
                temporaryStudents[iterationTemporaryStudents] = students[iterationStudents];
                iterationTemporaryStudents++;
            }



        }
        students=temporaryStudents;
    }




    public Student randomStudent(){
        int index=(int)(Math.random()*students.length);
        return students[index];
    }
    @Override
    public String toString(){
        String result="";
        for(int i=0;i<students.length;i++){
            result+="ID:"+students[i].getId()+" Vorname:"+students[i].getFirstName()+" Nachname:"+students[i].getSecondName();

        }
        return result;
    }
    public StudentDB() {

    }


    }


