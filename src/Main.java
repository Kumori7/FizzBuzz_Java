public class Main {
    public static void main(String[] args) {

        fizz(15);

    } // end of main method

    public static void fizz(int target) {

        for (int i = 1; i <= target; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) { // is multiple of 3 & 5

                System.out.println("fizzbuzz");

            } else if (i % 3 == 0) { // is multiple of 3 only

                System.out.println("fizz");

            } else if (i % 5 == 0) { // is multiple of 5 only

                System.out.println("buzz");

            } else { // is not a multiple of 3 & 5

                System.out.println(i);

            } // end of else statement


        } // end of for loop

    } // end of fizz method


} // end of Main Class

// https://howtodoinjava.com/java/puzzles/fizzbuzz-solution-java/
