package program.code;

import java.io.IOException;

public class Calculation {

    FileHandling output;

    public Calculation(int N) throws IOException {

        output = new FileHandling();

         Floyd(N);

    }

    void Floyd(int N) throws IOException {

        int counter=1;
        int rowsum;

        output.println( "Generate the first " + N + " rows of Floyd Triangle");
        output.println("");

        for(int i = 1; i <= N; i++){

            rowsum = 0;

            for(int j = 0; j < i; j++){

                System.out.print(counter + " ");
                output.print(counter + " ");

                rowsum=rowsum+counter;

                counter++;
            }
            System.out.print("\t=" + rowsum);
            System.out.println();

            //output.print("\t=" + rowsum);
            output.println("");

        }

        output.close();

    }

}
