public class ExercitiiMetode {
    public static void main(String[] args) {
        // exercitiul 1
        learningJava();
        learningJava();
        learningJava();
        //exercitiul 2
        learning2Code("Java");
        learning2Code("Python");
        learning2Code("JavaScript");
        learning2Code("C++");
        // exercitiul 3
        aflaNumarulMaiMare(5,9);
        //exercitiul 4
        lungimeaCuvantului("rebeca");
        lungimeaCuvantului("abracadabra");

        //pag 2 ex 1
        initialaConsoanaVocala("rebeca");
        initialaConsoanaVocala("ana");
        initialaConsoanaVocala("Radu");
        initialaConsoanaVocala("Alina");
        vocalaSauConsoanacuFor("Rebeca");
        vocalaSauConsoanacuFor("Ana");
        //pag 2 ex 2
        varsta(16);
        varsta(19);
        varsta(89);
        System.out.println(invers(5));
        System.out.println(invers(-5));
        System.out.println(maxim(5, 6));
        System.out.println(maxim(9, 7));
        System.out.println(media(3, 4, 7));
        System.out.println(media(9, 8, 7));
        System.out.println(lungime("Rebeca"));
        System.out.println(concat("Reb", "eca"));
        System.out.println(invers("Rebeca"));
        System.out.println(vremeabuna());
        System.out.println(rezultat(9));
        System.out.println(month("ianuarie"));
        System.out.println(month("mai"));
        System.out.println(month("iulie"));
        System.out.println(month("septembrie"));
        System.out.println(month("primavara"));
        System.out.println(nrminmax(9,2));
        System.out.println(nrminmax(15,5));
        System.out.println(nrminmax(12,12));
        System.out.println(mare4(45,9,8,6));
        System.out.println(mare4(9,9,3,2));
        System.out.println(adevar("rebeca"));
        System.out.println(caracterMijloc("rebeca"));
        System.out.println(caracterMijloc("abracadabra"));
        System.out.println(sumaCifrelor(789456));

    }

    // exercitiul 1
    private static void learningJava() {
        System.out.println("It's easy to learn Java");
    }

    //exercitiul 2
    private static void learning2Code(String limbajProgramare) {
        System.out.println("It's easy to learn " + limbajProgramare);
    }

    //exercitiul 3
    private static void aflaNumarulMaiMare(int a, int b) {

        if (a > b) {
            System.out.println("Numarul mai mare este:" + a);
        } else if (b > a) {
            System.out.println("Numarul mai mare este:" + b);
        } else {
            System.out.println("Numerele sunt egale");
        }


    }
    // execitiul 4

    private static void lungimeaCuvantului(String nume) {
        System.out.println("Lungimea cuvantului este: " + nume.length());
    }
    // pag 2 exercitiul 1

    private static void initialaConsoanaVocala(String nume) {
        if (nume == null || nume.isEmpty()) {
            System.out.println("Stringul este gol sau null");
            return;
        }

        char firstChar = Character.toLowerCase(nume.charAt(0));

        if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
            System.out.println(nume + " incepe cu vocala");
        } else {
            System.out.println(nume + " incepe cu consoana");
        }

    }

    // varianta cu for
    private static void vocalaSauConsoanacuFor(String cuvant) {
        char primaLitera = cuvant.toLowerCase().charAt(0);
        char vocale[] = {'a', 'e', 'i', 'o', 'u'};
        for (char v : vocale) {
            if (primaLitera == v) {
                System.out.println(cuvant + " incepe cu vocala");
                break;
            } else {
                System.out.println(cuvant + " incepe cu consoana");
                break;
            }
        }
    }

    // pag 2 exercitiu 2
    private static void varsta(int varsta) {
        if (varsta < 18) {
            System.out.println("too young");
        } else if (varsta >= 18 && varsta < 60) {
            System.out.println("just fine");
        } else {
            System.out.println("too old");
        }
    }

    private static int invers(int numar) {
        int inversbun = -numar;
        return inversbun;
    }

    private static int maxim(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    private static double media(int a, int b, int c) {
        double calcul = (a + b + c) / 3.0;
        return calcul;
    }

    private static int lungime(String cuvant) {
        return cuvant.length();
    }

    private static String concat(String a, String c) {
        return a + c;
    }

    private static String invers(String cuvant) {
        int lung = cuvant.length();
        String nume = "";
        for (int i = lung - 1; i >= 0; i--) {
            nume += cuvant.charAt(i);
        }

        return nume;

    }

    private static String vremeabuna() {
        return "In sfarsit vremea este buna!";
    }

    private static boolean rezultat(int nrnr) {
        if (nrnr % 2 == 0) {
            return true;
        } else {
            return false;

        }
    }

    private static String month(String lunaAnotimp) {
        if (lunaAnotimp == ("martie") || lunaAnotimp == ("aprilie") || lunaAnotimp == ("mai")) {
            return "primavara";
        } else if (lunaAnotimp == ("iunie") || lunaAnotimp == ("iulie") || lunaAnotimp == ("august")) {
            return "vara";
        } else if (lunaAnotimp == ("septembrie") || lunaAnotimp == ("octombrie") || lunaAnotimp == ("noiembrie")) {
            return "toamna";
        } else if (lunaAnotimp == ("decembrie") || lunaAnotimp == ("ianuarie") || lunaAnotimp == ("februarie")) {
            return "iarna";
        } else {
            return "unknown";
        }


    }
    private static int nrminmax (int a, int b){
        if(a>b){return a;}
        else if(b>a){return b;}
        else {return a;}
    }
    private static int mare4 (int a, int b, int c, int d){
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }

        return max;



    }
    private static boolean adevar (String cifra){
        int num = cifra.length();
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    private static String caracterMijloc (String word){
        int lung = word.length();
        String rezultat = "";
        if (lung == 1) {
            rezultat = word;
        } else if (lung % 2 == 0) {
            int mijloc1 = lung / 2 - 1;
            int mijloc2 = lung / 2;
            rezultat = word.substring(mijloc1, mijloc2 + 1);
        } else {
            int mijloc = lung / 2;
            rezultat = word.substring(mijloc, mijloc + 1);
        }
        return rezultat;



    }
    private static int sumaCifrelor(int numar) {
        int suma = 0;


        for (; numar != 0; numar /= 10) {
            suma += numar % 10;
        }

        return suma;


    }

}

