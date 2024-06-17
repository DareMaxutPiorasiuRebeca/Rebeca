public class Algoritmi {
    public static void main(String[] args) {
        // un sir de nr intregi, scrieti program care afiseaza vecinii
        int numbers[] = {1,-25,34,-2,67,5};

        for (int n: numbers)
        {
            System.out.println((n+1)+" "+(n-1));
        }
        // sa afisam doar numerele negative

        for (int n:numbers)
        {
            if(n<0){
                System.out.println(n);
            }
        }
        // array tari

        String text = "Abracadabra";
        String text2 = "Abracadabra";
        System.out.println(text.charAt(3));
        System.out.println(text.concat(text2));
        System.out.println(text.contains("cat") );
        System.out.println(text.endsWith("bra"));
        System.out.println(text.length());
        System.out.println(text.indexOf('c'));
        System.out.println(text.startsWith("Abr"));
        System.out.println(text.substring(6,9));



        String tari[] = {"Anglia","Romania","ALbania","Franta","Elvetia","China","SUA","Australia"};

        // initiala fiecarei tari

        for (String t:tari)
        {System.out.println(t.charAt(0));}

        //tarile care incep cu litera a

        for (String t:tari)
        {if(t.charAt(0)=='A')
        {
            System.out.println(t);
        }}

        // numarul de litere pentru fiecare tara

        for(String t:tari){
            System.out.println(t+ " are nr de litere: "+t.length());
        }

        // tara cu cel mai lung nume

        String max = "";
        for (String t:tari)
        {
            if (t.length()>max.length()) {
                max = t;
            }
        }
        System.out.println("Tara cu cele mai multe litere este: "+max);

        // tara cu cel mai scurt nume

        String min = "";
        for (String j:tari)
        {
            if (j.length()<min.length()) {
                min = j;
            }
        }
        System.out.println("Tara cu cele mai putine litere este: "+min);


     // tara cu cel mai lung nume

        int maxLetters = tari[0].length();
        String taracucelmailungnume = tari[0];

        for (String t : tari) {
            if (t.length() > maxLetters) {
                maxLetters = t.length();
                taracucelmailungnume = t;
            }
        }

        System.out.println("Numarul maxim de litere este: " + maxLetters);
        System.out.println("Tara cu cel mai lung nume este: " + taracucelmailungnume);
     // cea mai scurta lungime la Tari

        int minletter = tari[0].length();
        String taracucelscurtnume = tari[0];

        for (String t : tari) {
            if (t.length() < minletter){
                minletter = t.length();
                taracucelscurtnume = t;
            }
        }

        System.out.println("Numarul minim de litere este: " + minletter);
        System.out.println("Tara cu cel mai scurt nume este: " + taracucelscurtnume);

    }
}
