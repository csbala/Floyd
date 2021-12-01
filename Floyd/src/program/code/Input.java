package program.code;

import java.util.Scanner;

public class Input {

    public int N;

    void input() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of rows to generate: ");

        ValidInput(scan);

        scan.close();
    }

    void ValidInput( Scanner scan){
        if(scan.hasNextInt()) {
            N = scan.nextInt();
            if( N < 0 ){ System.out.println("Not a valid input"); input();}
        }else{
            System.out.println("Not an integer input"); input();
        }
    }
}
