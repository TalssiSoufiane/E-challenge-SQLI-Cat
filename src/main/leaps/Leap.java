package main.leaps;

public abstract class Leap {
    protected String path = "";
    protected int size = 0;
    public Leap(){

    }
    public String toString(){
        return path;
    }

    protected int getSize() {
        return size;
    }
}
