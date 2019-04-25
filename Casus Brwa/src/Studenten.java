import java.util.ArrayList;

public class Studenten {
    protected ArrayList<Student> studentenLijst;


    public Studenten(){
        studentenLijst = new ArrayList<Student>();
       studentenLijst.add(new Student("test", 001));
        studentenLijst.add(new Student("test2",002 ));
        studentenLijst.add(new Student("test3",003));

    }

    public ArrayList<Student> getStudentenLijst(){
        return studentenLijst;
    }


    public void setStudentenLijst(ArrayList<Student> studentenLijst) {
        this.studentenLijst = studentenLijst;
    }

    public void studentInschrijven(String studentNaam, int studentNummer){

    }
}