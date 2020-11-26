package main;

import main.leaps.DecoratedLeap;
import main.leaps.FirstLeap;
import main.leaps.Leap;

public class Cat {
    Leap test = new FirstLeap();
    public String path() {
        return test.toString();
    }

    public void leap() {
        test = new DecoratedLeap(test);
    }
}
