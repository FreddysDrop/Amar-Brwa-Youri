public class Student {
    protected String studentenNaam;
    protected int studentNummer;

    public Student(String studentenNaam, int studentNummer) {
        this.studentenNaam = studentenNaam;
        this.studentNummer = studentNummer;
    }

    public String getStudent() {
        return studentenNaam + studentNummer;
    }

    public void setStudent(String studentenNaam, int studentNummer) {
        this.studentenNaam = studentenNaam;
        this.studentNummer = studentNummer;
    }

    @Override
    public String toString() {
        return "Naam:" + studentenNaam + "\t" +
                "Studentnummer: " + studentNummer ;

    }
}
