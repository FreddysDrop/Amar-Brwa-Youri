import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
    public static void main(String[] args) {
        menu();
    }

    public static int menu() {
        Vragen vragenExamenLijst;
        Studenten student = new Studenten();
        ArrayList<Student> studentenLijst = student.getStudentenLijst();


        Examens examen = new Examens();
        ArrayList<Examen> examensLijst = examen.getExamensLijst();

        int selection;

        Scanner input = new Scanner(System.in);

        System.out.println("Menu");

        System.out.println("");

        System.out.println("1) Lijst met examens");

        System.out.println("2) Lijst met studenten");

        System.out.println("3) Nieuwe student inschrijven");

        System.out.println("4) Student verwijderen");

        System.out.println("5) Examen afnemen");

        System.out.println("6) Is student geslaagd voor test?");

        System.out.println("7) Welke examens heeft student gehaald?");

        System.out.println("8) Welke student heeft de meeste examens gehaald?");

        System.out.println("0) Exit");

        System.out.println("");

        System.out.println("Uw keuze: ");
        selection = Integer.parseInt(input.nextLine());


        switch (selection) {

            case 1:


                int keuze1;


                for (int count = 0; count < examensLijst.size(); count++) {


                    System.out.println(count + 1 + ") " + examensLijst.get(count));
                }


                System.out.println("");
                System.out.println("Wat wilt u doen?");
                System.out.println("1) terug naar hoofdmenu");
                System.out.println("2) nieuwe examen toevoegen");
                System.out.println("3) stoppen");
                System.out.println("");

                System.out.println("Uw keuze: ");
                keuze1 = Integer.parseInt(input.nextLine());
                switch (keuze1) {
                    case 1:
                        Menu.menu();
                        break;
                    case 2:

                        ExamenToevoegen(examensLijst);

                        /*System.out.println("voor nieuwe examen naam in");
                        String scannerinput1 = input.nextLine();
                        //for(int count = 0; count < examensLijst.size(); count++) {

                            examensLijst.add(new Examen((scannerinput1)));
                            Menu.menu();*/
                        // }


                        break;
                    case 3:
                        break;
                }
                break;

            case 2:

                int keuze2;


                for (int count = 0; count < studentenLijst.size(); count++) {

                    System.out.println(count + ") " + studentenLijst.get(count));
                }

                System.out.println("");
                System.out.println("Wat wilt u doen?");
                System.out.println("");
                System.out.println("1) terug naar hoofdmenu");
                System.out.println("2) stoppen");
                System.out.println("");

                System.out.println("Uw keuze: ");

                keuze2 = Integer.parseInt(input.nextLine());
                switch (keuze2) {
                    case 1:
                        Menu.menu();
                        break;
                    case 2:


                        break;
                }
                break;

            case 3:


                int keuze3;

                System.out.println("");
                System.out.println("Wat wilt u doen");
                System.out.println("");
                System.out.println("1) terug naar hoofdmenu");
                System.out.println("2) nieuwe student toevoegen");
                System.out.println("3) stoppen");
                System.out.println("");

                System.out.println("Uw keuze: ");
                keuze3 = Integer.parseInt(input.nextLine());
                switch (keuze3) {
                    case 1:
                        Menu.menu();
                        break;
                    case 2:
                        System.out.println("voor nieuw student naam in:");
                        String scannerinput3 = input.nextLine();
                        int studentnummer = studentenLijst.size() + 1;
                        studentenLijst.add(new Student(scannerinput3, studentnummer));

                        Menu.menu();

                        break;
                    case 3:

                        break;
                }
                break;

            case 4:
                int keuze4;

                System.out.println("");
                System.out.println("Wat wilt u doen");
                System.out.println("");
                System.out.println("1) terug naar hoofdmenu");
                System.out.println("2) student verwijderen");
                System.out.println("3) stoppen");
                System.out.println("");

                System.out.println("Uw keuze: ");
                keuze4 = Integer.parseInt(input.nextLine());
                switch (keuze4) {
                    case 1:
                        Menu.menu();
                        break;
                    case 2:
                        // code voor student verwijderen

                        System.out.println("voer student nummer in:");
                        int scannerinput4remove = Integer.parseInt(input.nextLine());

                        //studentenNummerLijst.remove(scannerinput4remove-1);
                        studentenLijst.remove(scannerinput4remove - 1);


                        Menu.menu();

                        break;
                    case 3:

                        break;
                }
                break;

            case 5:


                int keuze5;

                System.out.println("");
                System.out.println("Wat wilt u doen");
                System.out.println("");
                System.out.println("1) terug naar hoofdmenu");
                System.out.println("2) examen afleggen");
                System.out.println("3) stoppen");
                System.out.println("");

                System.out.println("Uw keuze: ");
                keuze5 = Integer.parseInt(input.nextLine());
                switch (keuze5) {
                    case 1:
                        Menu.menu();
                        break;
                    case 2:


                        for (int count = 0; count < examensLijst.size(); count++) {


                            System.out.println(count + 1 + ") " + examensLijst.get(count));
                        }
                        System.out.println("Selecteer een examen: ");
                        int examenkeuze = Integer.parseInt(input.nextLine());


                        // code voor examen afleggen
/*
                        int examenkeuze;
                        examenkeuze = input.nextInt();

                        switch (examenkeuze) {
                            case 1:
                                System.out.println("---------------ISBR---------------");
                                System.out.println("Welkom bij het examen ISBR.");
                                System.out.println("Dit examen bestaat uit 5 vragen. Druk op 1 om door te gaan of 2 om terug te gaan naar het menu");
                                int examenISBR;
                                examenISBR = input.nextInt();
                                switch (examenISBR) {
                                    case 1:
                                        System.out.println("1. Hoe heet je?");
                                        break;
                                }
                            case 2:
                        }
                        System.out.println("2. Wat is 1+1?");
                        System.out.println("3. Wat is zwaarder, 1 kilo veren of 1 kilo staal?");
                        boolean vraag3;
                        System.out.println("4");
                        break;

                    case 3:

                        break;
                }*/
                        break;
                    case 3:
                        break;
                }
                break;
            case 6:

                int keuze6;

                System.out.println("");
                System.out.println("Wat wilt u doen?");
                System.out.println("");
                System.out.println("1) terug naar hoofdmenu");
                System.out.println("2) Is student geslaagd voor test?");
                System.out.println("3) stoppen");
                System.out.println("");

                System.out.println("Uw keuze: ");
                keuze6 = Integer.parseInt(input.nextLine());
                switch (keuze6) {
                    case 1:
                        Menu.menu();
                        break;
                    case 2:
                        // hier code invoeren code voor of student geslaagd is voor een bepaald test
                    case 3:

                        break;
                }
                break;


            case 7:

                int keuze7;

                System.out.println("");
                System.out.println("Wat wilt u doen?");
                System.out.println("");
                System.out.println("1) terug naar hoofdmenu");
                System.out.println("2) welke examens heeft student gehaald");
                System.out.println("3) stoppen");
                System.out.println("");

                System.out.println("Uw keuze: ");
                keuze7 = Integer.parseInt(input.nextLine());
                switch (keuze7) {
                    case 1:
                        Menu.menu();
                        break;
                    case 2:
                        // hier code invoeren code voor welke examens student geslaagd is
                    case 3:

                        break;
                }
                break;


            case 8:

                int keuze8;

                System.out.println("");
                System.out.println("Wat wilt u doen?");
                System.out.println("");
                System.out.println("1) terug naar hoofdmenu");
                System.out.println("2) welke student heeft het meeste examens gehaald");
                System.out.println("2) stoppen");
                System.out.println("");

                System.out.println("Uw keuze: ");
                keuze8 = Integer.parseInt(input.nextLine());
                switch (keuze8) {
                    case 1:
                        Menu.menu();
                        break;
                    case 2:
                        // hier code invoeren code voor welke student het meeste examens heeft gehaald
                        break;
                    case 3:

                        break;
                }
                break;


            case 0:
                System.out.println("0");
                break;
        }
        return selection;
    }

    public static void ExamenToevoegen(ArrayList<Examen> examensLijst) {
        Scanner input = new Scanner(System.in);
        System.out.println("voor nieuwe examen naam in");
        String scannerinput1 = input.nextLine();
        //for(int count = 0; count < examensLijst.size(); count++) {

        examensLijst.add(new Examen(input.nextLine()));
        Menu.menu();

    }

}