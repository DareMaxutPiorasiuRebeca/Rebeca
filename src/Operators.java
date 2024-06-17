import javax.swing.*;

public class Operators {

    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        int c = 30;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a%c);


       //System.out.println(++a);
        //++a prima data incrementeaza si apoi il afiseaza
        //a++ afiseaza si apoi incrementeaza
        System.out.println(a++);
        System.out.println(a);

        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);

        System.out.println(100+50);
        System.out.println(a+b);
        System.out.println(a+50);

        // Operatori de atribuire
        int d = 10;
        int e = d;


        d+=2; // echivalent cu d = d+2
        System.out.println(d);

        d-=3;// echivalent cu d = d-3
        System.out.println(d);

        // for (start, stop, pas){do something}


        for (int i = 0; i<=10;i+=2)
        {
            System.out.println(i);
        }

        for (int i = 10; i>=0;i--){
            System.out.println(i);
        }
        // operatori de comparare

        System.out.println(a>b);
        System.out.println(b>a);
        System.out.println(b>=a);
        System.out.println(a>=b);

        System.out.println(5==5);
        System.out.println(a==b);

        System.out.println(a!=b); // a not egal cu b

        boolean iLoveJava = false;
        System.out.println(iLoveJava);
        System.out.println(!iLoveJava); // inversul lui true in acest caz

        // if = daca o conditie e adevarata fa ceva if (conditie ) daca e true fa ceva

        if (iLoveJava){
            System.out.println("Learn test automation ");
        }
        else {
            System.out.println("Still Learning");
        }

        // operatori logici sau binari

        System.out.println(d);
        System.out.println(e);

        if(d<10 || e<=10){
            System.out.println("d SAU e mai mici sau egale cu 10");
                    }
        if(d<10 && e<=10) {
            System.out.println("d SI e mai mici sau egale cu 10");
        }

        // exercitii

        int x = 10;
        int y = 6;
        System.out.println(10*6);
        System.out.println(10/5);
        System.out.println(++x);
        x = 6;
        System.out.println(x);

        int suma = x+y;
        if (suma>=10){
            System.out.println("suma este mai mare decat 10");
        }
        else {
            System.out.println("suma este mai mica decat 10");
        }
        if (suma %2==0){
            System.out.println("suma este numar par");
        }
        else{
            System.out.println("nimic");
        }

        // exercitii optionale

        // exercitiul 1

        int var1 = 2;
        int var2 = 5;
        int var3 = 7;
        int var4 = 8;

        System.out.println(var1+var2+var3+var4);
        System.out.println(var1*var2*var3*var4);
        System.out.println(var4/var2);

        // exercitiu 2

        var1 += 1;
        var1 += 1;
        var1 += 1;
        System.out.println("Valoarea lui var1 după a treia incrementare este: " + var1);

        // exercitiu 3

        var2 -= 2;
        var2 -= 2;
        System.out.println("valoarea lui var2 dupa a doua decrementare este: "+ var2);

        // exercitiul 4


        boolean cond1 = ((var1+var2+var3+var4) > 100);
        boolean cond2 =((var1*var2*var3*var4) > 1000);
        System.out.println(cond1);
        System.out.println(cond2);

        // exercitiul 5

        if (cond1  || cond2 )
        {
            System.out.println("cel putin o conditie e adevarata");
        }



        if (cond1 && cond2 )
        {
            System.out.println("ambele conditii sunt adevarate");
        }
















    }
}

