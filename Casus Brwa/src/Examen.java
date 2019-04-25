public class Examen {
    protected String examennaam;

    public Examen(String examennaam){
        this.examennaam = examennaam;
    }

    public String getExamennaam() {
        return examennaam;
    }

    @Override
    public String toString() {
        return examennaam;
    }
}
