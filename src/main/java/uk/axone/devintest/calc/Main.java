package uk.axone.devintest.calc;

public class Main {

    public void method1(){
        System.out.println("Called from method one of Main Class");
    }
    public void method2(){
        System.out.println("Called from method two of Main Class");
    }
    public static void main(String[] args) {
        Main mainObj = new Main();
        mainObj.method1();
        mainObj.method2();
    }
}