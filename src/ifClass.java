public class ifClass {
    public static void main(String[] args) {
        int time = 8;

        if(time>24||time<0)
        {
            System.out.println("inncorect time");
        }

        else if (time>18)
        {
            System.out.println("Good Evening!");
        }
        else if (time>12)
        {
            System.out.println("Good Day!");
        }
        else
        {
            System.out.println("Good morning!");
        }

        int dayNumber = 9;

        switch (dayNumber)
        {
            case 1: System.out.println("Luni");break;
            case 2: System.out.println("Marti");break;
            case 3:System.out.println("Miercuri");break;
            case 4:System.out.println("Joi");break;
            case 5:System.out.println("Vineri");break;
            case 6:System.out.println("Sambata");break;
            case 7:System.out.println("Duminica");break;
            default:
                System.out.println("ziua nu este valida");


                   }

    }
}
