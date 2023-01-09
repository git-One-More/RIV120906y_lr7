package Lr7_Example4;
/*
в каждом из классов должен быть конструктор,
позволяющий создавать объект на основе значений полей,
переданных аргументами конструктору,
а также конструктор создания копии.
 */
public class ThirdSubClass extends SecondSubClass {
    ThirdSubClass(char char1) {
        super(char1);
    }
    public int int1;
    public void setChar1Str1Int1(char char1, String str1, int int1) {
        super.char1 = char1;
        super.str1 = str1;
        this.int1 = int1;
    }
    ThirdSubClass(char char1, String str1, int int1) {
        super(char1,str1);
        setChar1Str1Int1(super.char1, super.str1, int1);
    }
    ThirdSubClass(ThirdSubClass copy) {
        super(copy.char1, copy.str1);
        this.setChar1Str1Int1(copy.char1, copy.str1, copy.int1);
    }
    public String toString() {
        String ThirdFieldValue =
                "\n str 2 = " + this.getInt1();
        return super.toString()+ThirdFieldValue;
    }
    public int getInt1() {
        return int1;
    }
}