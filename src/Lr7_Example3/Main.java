package Lr7_Example3;

public class Main {
    public static void main(String[] args) {
        FirstSupClass superClassTest = new FirstSupClass(512);
        String className1 = superClassTest.toString();
        System.out.println(className1);

        SecondSubClass FirstSubClassTest = new SecondSubClass(1024,'K');
        String className2 = FirstSubClassTest.toString();
        System.out.println(className2);

        ThirdSubClass SecondSubClassTest = new ThirdSubClass(1024,'K',"кибибайт");
        String className3 = SecondSubClassTest.toString();
        System.out.println(className3);
    }
}
