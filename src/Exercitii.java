public class Exercitii {
    public static void main(String[] args) {
        byte myNum = 9;
        System.out.println(myNum);

        float myFloatNum = 8.99f;
        System.out.println(myFloatNum);

        char myLetter = 'A';
        System.out.println(myLetter);

        boolean myBool = false;
        System.out.println(myBool);

        String myText = "Hello world";
        System.out.println(myText);

        String myOtherText = "1a2b3c";
        System.out.println(myOtherText);

        byte myBite = 7;
        double x = myBite;
        System.out.println(x);

        float myFloat = 5.5f;
        int z = (int)myFloat;
        System.out.println(z);

        String tara = "Romania";
        int lungime = tara.length();
        System.out.println(lungime);

        System.out.println(tara.length());


        double[] numbers = {2,4,6,8};
        System.out.println(numbers[1]);

        System.out.println(numbers[3]);

       for (int i=0;i<numbers.length;i++){
           System.out.println(numbers[i]);
              }

       float floatUnu = 2.5f;
       float floatDoi = 3.5f;
        System.out.println(floatUnu+floatDoi);

        System.out.println(floatDoi-floatUnu);

        System.out.println(floatUnu*floatDoi);

        String myFavoriteMovie = "Great Expectation";
        String textNou = "My favorite movie is ";
        System.out.println(textNou+myFavoriteMovie);

        myFavoriteMovie = "My favorite movie is \"Sissi\"";

        System.out.println(myFavoriteMovie);

        String numeMare = myFavoriteMovie.toUpperCase();
        System.out.println(numeMare);

        String numeMic = myFavoriteMovie.toLowerCase();
        System.out.println(numeMic);

        System.out.println(myFavoriteMovie.toUpperCase());

        System.out.println(myFavoriteMovie.length());

        char[] myCharDoi = {'a','b','c','d'};
        System.out.println(myCharDoi[0]);
        System.out.println(myCharDoi[1]);
        System.out.println(myCharDoi[3]);
        for (int i=0;i<myCharDoi.length;i++){
            System.out.print(myCharDoi[i]+",");
        }
    }
}
