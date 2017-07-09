import java.util.Scanner;

public class BatStats {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of times at bat: ");
        int arraySize = scan.nextInt();
        System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = homerun");

        int[] arrayOfBaseHits = new int[arraySize];


        for (int i = 0; i < arrayOfBaseHits.length ; i++) {
            System.out.println("Result for at-bat " + i + ": ");
            int Bases = scan.nextInt();
            arrayOfBaseHits[i] = Bases;

        }

        int sumBaseHits = 0;
        for (int i = 0; i < arrayOfBaseHits.length ; i++) {
            sumBaseHits += arrayOfBaseHits[i];
        }
        double slugAvg = (double)sumBaseHits/arrayOfBaseHits.length;
        System.out.println("You're slugging average is: " + slugAvg);

        int sumNoOutBaseHits = 0;

        for (int i = 0; i < arrayOfBaseHits.length ; i++) {
//            if (arrayOfBaseHits[i] == 1 || arrayOfBaseHits[i] == 2 || arrayOfBaseHits[i] ==3 || arrayOfBaseHits[i] == 4){
//                sumNoOutBaseHits +=
//
//            }


        }
        System.out.println(sumNoOutBaseHits);

//        double batAvg = (double)sumNoOutBaseHits/arrayOfBaseHits.length;
//        System.out.println("You're batting average is: " + batAvg);
    }
}
