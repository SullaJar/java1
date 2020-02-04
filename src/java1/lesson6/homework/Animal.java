package java1.lesson6.homework;

public class Animal {

    double maxRun;
    double maxJump;
    double maxSwim;

    public Animal(int maxRun, double maxJump, int maxSwim) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.maxSwim = maxSwim;
    }

    public boolean run (double value) {
        return this.maxRun>value;
    }

    public boolean jump (double value){
        return this.maxJump>value;
    }


}
