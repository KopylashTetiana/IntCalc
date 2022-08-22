package Calc;

public class Context { //the main class, which contains all the current variable values and actions,
    int x;              //and the current stage of the calculator program
    int y;
    char o;
    State state;

    public Context() {  //constructor assigns a value to the object state
        state = new StateX();
        state.clear(this);

    }
    public void press(char key) {
        switch(key) { //using the 'case' operation, I mapped all possible keys to methods of the State class.
            case 'c' :
            case 'C' : state.clear(this); break;
            case '0' :
            case '1' :
            case '2' :
            case '3' :
            case '4' :
            case '5' :
            case '6' :
            case '7' :
            case '8' :
            case '9' : state.digit(this, key); break;
            case '+' :
            case '-' :
            case '*' :
            case '/' : state.arithm(this, key); break;
            case '=' : state.equal(this);
        }

    }
    public int run (String keys) { //this method receives a string like "C5+4/8="
        for(char key : keys.toCharArray()) { //and executes the press() method on each character
        press(key);
        }
        return x;
    }
}
