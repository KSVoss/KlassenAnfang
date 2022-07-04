package model;

public class StudentDB {
    private Student[] students;
    public StudentDB(Student[] students){
        this.students=students;


    }
    public Student[] getAllStudents()
    {
        return null;
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
    public Student getRandomStudent(){
        return null;
    }
    public  void addStudent(Student student){}
    public  void removeStudent(Student student){}


    }


