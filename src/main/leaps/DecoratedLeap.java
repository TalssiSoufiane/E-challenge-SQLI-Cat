package main.leaps;

public class DecoratedLeap extends Leap {
    private Leap leap;
    public DecoratedLeap(Leap leap){
        this.leap = leap;
        jump();
    }
    public void jump(){
        if(leap.getSize()>=4)
            size = leap.getSize();
        else
            size= leap.getSize()+1;
        path=leap+".".repeat(size)+"*";
    }
}
