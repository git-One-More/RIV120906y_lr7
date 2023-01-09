package Lr7_Example2;
/*
Напишите программу, в которой есть суперкласс с приватным текстовым полем.
В базовом классе должен быть метод для присваивания значения полю: без параметров и с одним текстовым параметром.
Объект суперкласса создается передачей одного текстового аргумента конструктору.
Доступное только для чтения свойство результатом возвращает длину текстовой строки.
На основе суперкласса создается подкласс.
В подклассе появляется дополнительное открытое целочисленное поле.
В классе должны быть такие версии метода для присваивания значений полям
(используется переопределение и перегрузка метода из суперкласса): без параметров, с текстовым параметром, с целочисленным параметром, с текстовым и целочисленным параметром. У конструктора подкласса два параметра (целочисленный и текстовый).
 */
public class superClassTest {
    private String str1;
    superClassTest() {setStr1();}
    superClassTest (String str1){setStr1(str1);}
    public void setStr1 (){
        this.str1 = "здесь ничего нет";
    }
    public void setStr1 (String str1){
        this.str1 = str1;
    }
    public String getStr1(){
        return str1;
    }
    public int getStr1length(){
        return str1.length();
    }
    @Override
    public String toString() {
        String superClassNameAndFieldValue = "superClassTest{" + "str1=\"" + getStr1() + '\"' + " string.length = " +"\""+getStr1length()+"\"}";
        return superClassNameAndFieldValue;
    }
}

