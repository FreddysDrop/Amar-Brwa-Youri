import java.util.ArrayList;
import java.util.Scanner;

public class Examens {
    private ArrayList<Examen> examensLijst;



    public Examens() {
        examensLijst = new ArrayList<Examen>();
        examensLijst.add(new Examen("ISBR"));
        examensLijst.add(new Examen("ISID"));
        examensLijst.add(new Examen("ISDQ"));
        examensLijst.add(new Examen("APIP"));
    }
    public ArrayList<Examen> getExamensLijst() {
        return examensLijst;

    }

    public void setExamensLijst(ArrayList<Examen> examensLijst) {
        this.examensLijst = examensLijst;
    }

/*    public static void ExamenToevoegen(ArrayList<Examen> examensLijst){
        Scanner input = new Scanner(System.in);
        System.out.println("voor nieuwe examen naam in");
        String scannerinput1 = input.nextLine();
        //for(int count = 0; count < examensLijst.size(); count++) {

        examensLijst.add(new Examen((scannerinput1)));
        Menu.menu();*/


}
