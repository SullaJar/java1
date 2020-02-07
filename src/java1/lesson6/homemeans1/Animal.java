package java1.lesson6.homemeans1;

import java.util.List;
import java.util.Random;

interface Run {
    void run(int length);
}
interface Swim {
    void swim(int length);
}
interface Jump {
    void jump(int height);
}

public abstract class Animal implements Run, Jump, Swim {
    protected int runLimit, swimLimit, jumpLimit;
}
