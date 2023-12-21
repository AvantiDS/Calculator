package uk.axone.devintest.calc;

public class Calc {

    int a;
    int b;

    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add(){
        return a+b;
    }

    public int sub(){
        return a-b;
    }

}
