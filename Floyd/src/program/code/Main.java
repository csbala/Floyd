package program.code;


import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Input input = new Input();
        input.input();
        new Calculation(input.N);
    }
}
