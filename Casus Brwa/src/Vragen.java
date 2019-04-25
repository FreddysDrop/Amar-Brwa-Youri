import java.util.ArrayList;

public class Vragen {
    private ArrayList<String> examensvragenLijst;

    public Vragen() {
        ArrayList<String> examenvragenISBR = new ArrayList<String>();
        examenvragenISBR.add("hoe heet je?");
        examenvragenISBR.add("1 + 1 = ");
        ArrayList<String> examenvragenISDQ = new ArrayList<String>();
        examenvragenISDQ.add("hoe heet je?");
        examenvragenISDQ.add("1 + 1 = ");

        ArrayList<String> examenvragenISID = new ArrayList<String>();
        examenvragenISID.add("hoe heet je?");
        examenvragenISID.add("1 + 1 = ");

        ArrayList<String> examenvragenAPIP = new ArrayList<String>();
        examenvragenISBR.add("hoe heet je?");
        examenvragenISBR.add("1 + 1 = ");


    }

    public ArrayList<String> getExamensvragenLijst() {
        return examensvragenLijst;
    }

    public void setExamensLijst(ArrayList<String> examensLijst) {
        this.examensvragenLijst = examensLijst;
    }





}
