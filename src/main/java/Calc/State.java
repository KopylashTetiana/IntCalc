package Calc;

public abstract class State {
    abstract void clear (Context context);
    abstract void digit (Context context, char key);
    abstract void arithm  (Context context, char key);
    abstract void equal (Context context);
}
