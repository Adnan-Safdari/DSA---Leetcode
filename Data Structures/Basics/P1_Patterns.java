
public class P1_Patterns {

    static void displayPatternOne() {
        /*
        *****
        *****
        *****
        *****
        *****
         */
        System.out.println("\n==== PATTERN 1 ====");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void displayPatternTwo() {
        /*
        *
        **
        ***
        ****
        *****
         */
        System.out.println("\n==== PATTERN 2 ====");
        int count = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print("*");
            }
            System.out.println();
            count++;
        }
    }

    static void displayPatternThree() {
        /*
    1
    12
    123
    1234
    1235
         */
        System.out.println("\n==== PATTERN 3 ====");
        int count = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
            count++;
        }
    }

    static void displayPatternFour() {
        /*
    1
    22
    333
    4444
    55555
         */
        System.out.println("\n==== PATTERN 4 ====");
        int count = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(count);
            }
            System.out.println();
            count++;
        }
    }

    static void displayPatternFive() {
        /*
        *****
        ****
        ***
        **
        *
         */
        System.out.println("\n==== PATTERN 5 ====");
        int count = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = count--; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void displayPattenSix() {
        /*
        12345
        1234
        123
        12
        1
         */
        System.out.println("\n==== PATTERN 6 ====");
        int count = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= count; j++) {
                System.out.print(j);
            }
            count--;
            System.out.println();
        }
    }

    static void displayPatternSeven(){
        /*
         
            *
           ***
          *****
         *******
        *********
         */
        int N = 5;
        for(int i=0; i<N; i++){  
            // for(int N)
        }
    }

    public static void main(String[] args) {
        displayPatternOne();
        displayPatternTwo();
        displayPatternThree();
        displayPatternFour();
        displayPatternFive();
        displayPattenSix();
    }
}
