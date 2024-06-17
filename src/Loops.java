public class Loops {
    public static void main(String[] args) {
        for(int i=0; i<8; i++)
        {
            if(1==4){continue;}
            System.out.println("i = "+i);

        }

// de unde incep, cand ma opresc, ce fac = asta face forul


        String cars[] = {"BMW","Elbons 4zen","Dacia", "Fiat", "Opel", "Porsche"};
        for (String c: cars)
        {
           if (c=="Elbons 4zen")
           continue;
            {
              System.out.println("Azi vreau sa conduc "+c);
              //System.out.println(" dar mai bine conduce Catalin");break;


            }
        }

        int i = 0;
        while (i<5){
            //if (i==3){break;}
            // System.out.println("i="+i);
            i++;
            if (i==3){continue;}
            System.out.println("i="+i);
        }

        int j = 0;
        do {
            System.out.println("j="+j);
            j++;
        }
        while(j<5);



    }
}
