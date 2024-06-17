import javax.swing.*;

public class ExercitiiWhile {
    public static void main(String[] args) {
        // exercitiul 1 - scrieti nr intregi 0-10 (invlusiv)
        for (int i = 0; i <= 10; i++) {
            System.out.println("i=" + i);
        }


        // exercitiul 2 - descrescator 20-10 (inclusiv)


        for (int i = 20; i >= 10; i--) {
            System.out.println("i=" + i);
        }

        // exercutiul 3 - numere pare pozitive pana la 100

        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + ",");
        }
        System.out.println();

        //exercitiul 4

        String fructe[] = {"mere", "capsuni", "pere", "banane"};

        for (String c : fructe) {
            System.out.println("Imi place sa mananc " + c);
        }
        ;

        // exercitiul 5

        int numeLuna = 9;

        switch (numeLuna) {
            case 1:
                System.out.println("Ianuarie");
                break;
            case 2:
                System.out.println("Februarie");
                break;
            case 3:
                System.out.println("Martie");
                break;
            case 4:
                System.out.println("Aprilie");
                break;
            case 5:
                System.out.println("Mai");
                break;
            case 6:
                System.out.println("Iunie");
                break;
            case 7:
                System.out.println("Iulie");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("Septembrie");
                break;
            case 10:
                System.out.println("Octombrie");
                break;
            case 11:
                System.out.println("Noiembrie");
                break;
            case 12:
                System.out.println("Decembrie");
                break;
            default:
                System.out.println("luna nu este valida");
        }

        // ex obt 1

        int temperatura = 23;

        if (temperatura < 18) {
            System.out.println("Prea frig");
        } else if (temperatura >= 18 && temperatura <= 22) {
            System.out.println("OK");
        } else {
            System.out.println("Prea cald");
        }

        // ex opt 2
        char gender = 'f';
        boolean married = true;

        if (gender == 'm') {
            System.out.println("Domnul");
        } else if (gender == 'f') {
            if (married) {
                System.out.println("Doamna");
            } else {
                System.out.println("Domnișoara");
            }
        } else {
            System.out.println("eroare");
        }

        // ex opt 3

        int x = 9;
        int y = 9;


        if (x > y) {
            System.out.println("x (" + x + ") este mai mare decât y (" + y + ").");
        } else if (x < y) {
            System.out.println("y (" + y + ") este mai mare decât x (" + x + ").");
        } else {
            System.out.println("x și y sunt egale (" + x + ").");
        }


        // ex opt 4
        int z = 25;
        int max = x;
        if (y > max) {
            max = y;
        }

        if (z > max) {
            max = z;
        }
        System.out.println("Cel mai mare numar este " + max);

        // ex opt 5

        char letter = 'a';
        char[] vocale = {'a', 'e', 'i', 'o', 'u'};

        boolean esteVocală = false;

        for (char v : vocale) {
            if (letter == v) {
                esteVocală = true;
                break;
            }
        }

        if (esteVocală) {
            System.out.println(letter + " este vocală");
        } else {
            System.out.println(letter + " este consoană");
        }
        // exercitiul opt separat

        String cantec = ("Happy birthday to you");
        String nume = ("David");


        for (int j=0;j<2;j++){

        for (int i=0;i<2;i++)
        {
            System.out.println(cantec);
        }
        System.out.println("Happy birthday dear " + nume);
        System.out.println(cantec);

        System.out.println();}

        for (int i=0;i<2;i++)
        {
            System.out.println(cantec);
        }
        System.out.println("Happy birthday dear " + nume);
        System.out.println(cantec);

        // alta metoda pentru exercitiul 5 de la opt


        if (letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u')
        {
            System.out.println(letter + " este vocala");
        }
        else
        {
            System.out.println(letter + " este consoana");
        }

        // exercitiul cu cantec

        for (int i=0;i<2;i++){
            for (int j=0;j<4;j++){
                if(j==2)
                {
                    System.out.println("Happy birthday dear " + nume);
                }
                else{
                    System.out.println(cantec);
                }

            }
        }




    }
}

