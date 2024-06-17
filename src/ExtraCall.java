public class ExtraCall {
    public static void main(String[] args) {
        System.out.println(nume("Rebeca"));
        System.out.println(numar (6));
        System.out.println(numar (56));

        //int[] numbers = {3, -1, -7, 4, -2, 0, 5};
        System.out.println(countNegatives(new int[]{3,5,-9,8,9}));

        System.out.println(singsong("Rebeca"));

    }
    private static String nume(String numeleTau){
        return "I like to move it, move it,\n"+
                "I like to move it, move it,\n"+
                "I like to move it, move it,\n"+
                "I like to move it, move it,\n"+
                numeleTau+" likes to move it,\n"+
                "I like to move it, move it,\n"+
                "I like to move it, move it,\n"+
                "I like to move it, move it,\n"+
                numeleTau+" likes to move it.\n";}
    private static String numar (int numar){
        int [] arra = {2,5,-6,689,369,256,65,6};
        for (int element : arra) {
            if (element == numar) {
                return "numarul face parte din array";
            }
        }
        return "numarul nu face parte din array";}
    public static int countNegatives(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number < 0) {
                count++;
            }
        }
        return count;}

    //chall 1

    private static String singsong (String nume){
        String vers = "I like to move it, move it";
        String versNume = nume + "likes to move it";
        String afisare = "";
        for (int i=0;i<8;i++){
            if(i==3||i==7){

             afisare+=versNume+"\n";}
            else
            {
                afisare+=vers+"\n";
            }}
            return afisare;

    }




}

