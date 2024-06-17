public class ExtraCall {
    public static void main(String[] args) {
        System.out.println(nume("Rebeca"));
        System.out.println(numar (6));
        System.out.println(numar (56));

        int[] numbers = {3, -1, -7, 4, -2, 0, 5};
        System.out.println(countNegatives(numbers));

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

}

