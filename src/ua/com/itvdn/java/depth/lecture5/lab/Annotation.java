package ua.com.itvdn.java.depth.lecture5.lab;

//Задание
//Создать свою аннотацию используя аннотацию @Repeteable с Java 8, вызвать дважды аннотацию подтягивая
//разные параметры выполнить сложение 2-х чисел.
//@MathAnno(num1 = 50)
//@MathAnno(num2 = 100)
//public void mathSum(int num1, int num2)

import java.lang.annotation.Repeatable;
import java.lang.reflect.Method;

public class Annotation {

    @MyAnnatation(num1 = 10,num2 = 30)
    public void mySum(int num1, int num2){
        System.out.println(num1 + num2);
    }
    public static void main(String[] args) throws NoSuchMethodException {

        Class<?> myClass = Annotation.class;

        Object[] objects = new Object[]{10, 20};


        Method myMethod = myClass.getDeclaredMethod("mySum", null);

        MyAnnatation[] annatations =  myMethod.getAnnotationsByType(MyAnnatation.class);

       for(MyAnnatation temp : annatations){
           System.out.print(temp.num1() + " " + temp.num2());
       }

    }
}
@Repeatable(MyContainer.class)
@interface MyAnnatation {

    int num1() default 2;
    int num2() default 3;

}

@interface MyContainer {
    MyAnnatation[] value();
}
