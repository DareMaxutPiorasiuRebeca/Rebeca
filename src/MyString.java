import java.util.Locale;

public class MyString {
    public static void main(String[] args) {
        String text = "Hello ";
        String nume = "Rebeca";


        System.out.println(text+nume);

        //nume cu litere mari
        String numeMare = nume.toUpperCase();
        System.out.println(numeMare);
        // nume cu litere mici
        String numeMic = nume.toLowerCase();
        System.out.println(numeMic);

        // calcul pentru numar de caractere

        String propozitie = "Ana are mere";
        System.out.println(propozitie.length());

        // cum ne da un caracter dintr-o propozitie prima pozitie e 0 asa incepe numerotarea

        char primaLitera = propozitie.charAt(0);
        System.out.println(primaLitera);

        char a6aLitera = propozitie.charAt(5);
        System.out.println(a6aLitera);

        //pentru afiare pe doua linii \n, pentru ghilimele \"text\"

        String filmulPreferat ="Filmul meu preferat este \n\"Harry Potter\"";
        System.out.println(filmulPreferat);



    }
}
