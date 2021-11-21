package com.unideb.epam;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("Floyd.txt");

        if(!file.exists()){file.createNewFile();}

        PrintWriter pw = new PrintWriter(file);

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of rows to generate: ");

        int N = scan.nextInt();

        scan.close();

        pw.println( "Generate the first " + N + " rows of Floyd Triangle");

        int[] RowTotal = new int[N+1];
        int counter=1;
        int rowsum;

        for(int i = 0; i <= N; i++){
            rowsum = 0;
            for(int j = 0; j < i; j++){

                pw.print(counter + " ");
                rowsum=rowsum+counter;
                counter++;
            }

            RowTotal[i]=rowsum;
            pw.println();
        }

        pw.println();
        pw.println("The sum of each row (n) is denoted below ");
        pw.println("==================================================");
        pw.println();
        pw.println("RowCount\tRowTotal ");

        for(int i = 1 ;i <= N; i++) {
            pw.println( i + "\t\t\t" + RowTotal[i] );
        }

    pw.close();

    }
}

