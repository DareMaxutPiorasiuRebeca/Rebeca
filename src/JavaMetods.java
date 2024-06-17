
public class JavaMetods {
    public static void main(String[] args) {
        afiseazaCeva();
        afiseazaCeva();
        afiseazaCeva();
        helloNume("Rebeca");
        helloNume("Raluca");
        helloNumber(5);
        helloNumber(10);
        afiseazaNumeVarsta("Rebeca",35);
        afiseazaNumeVarsta("Ana",10);
        calculeazaSuma(5,10);
        calculeazaSuma(6,8);
        calculeazaDiferenta(9,2);
        calculeazaDiferenta(8,6);
        calculeazaProdus(2,5);
        calculeazaImpartirea(5,2);
        calculeazaSuma(2,5);
        calculeazaSuma(2.5,3.6);
        metoda1("Ana", "Rebeca");
        System.out.println(sum(5,10));
        System.out.println(concatenateTwoString("reb","eca"));
        System.out.println(aDouaLitera("Java"));

    }
    private static void afiseazaCeva(){
        System.out.println("Hello World!");
    }
    private static void helloNume(String nume){
        System.out.println("Hello "+nume);
    }

    private static void helloNumber(int number){
        System.out.println("Hello " +number);
    }

    private static void afiseazaNumeVarsta (String nume, int varsta){
        System.out.println("Ma numesc "+nume+" si am "+varsta+" de ani.");
    }
    private static void calculeazaSuma (int x, int y){
        System.out.println(x+y);
    }
    private static void calculeazaDiferenta(int x,int y){
        System.out.println(x-y);
    }
    private static void calculeazaProdus (int x,int y){
        System.out.println(x*y);
    }
    private static void calculeazaImpartirea(int x,int y){
        System.out.println(x/y);
    }
    private static void calculeazaSuma (double x, double y)
    {
        System.out.println(x+y);
    }
    private static void metoda1()
    {
        System.out.println("metoda1");
    }
    private static void metoda1(String nume)
    {
        System.out.println("metoda1 cu nume");
    }
    private static void metoda1(String nume1, String nume2)
    {
        System.out.println( "metoda 1 cu doua nume");
    }
    // metode cu return
    private static int sum (int a, int b){
        int sum = a+b;
        return sum;
    }
    private static String concatenateTwoString (String a, String b){
        String concat = a+b;
        return concat;
    }
    private static char aDouaLitera (String cuvant){
        return cuvant.charAt(1);
    }
}