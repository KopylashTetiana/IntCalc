package Calc;

public class StateX extends State {
    @Override
    void clear(Context context) {
        context.x = 0;
        context.y = 0;
        context.o = '+';


    }

    @Override
    void digit(Context context, char key) {
        context.x = context.x * 10 + Character.getNumericValue(key);

    }

    @Override
    void arithm(Context context, char key) {

    }

    @Override
    void equal(Context context) {

    }
}
