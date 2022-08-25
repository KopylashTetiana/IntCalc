import Calc.Context;

import java.io.IOException;

public class Main { //entrance to the app
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the Integer Calculator!");
        Context calc = new Context();
        while(true) {
            char key = (char) System.in.read();
            if(key >= ' ') { //we compare the key with ' ' to avoid reading the 'enter' key ('enter' < ' ')
                calc.press(key);
                System.out.println(calc);
            }
        }
    }
}
