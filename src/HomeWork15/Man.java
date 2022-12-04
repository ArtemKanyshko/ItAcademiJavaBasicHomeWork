package HomeWork15;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Man {
    int age;
    String name;
    String placeOfWork;
    static Class<Man> clazz = Man.class;

    public Man() {
    }

    public Man(int age, String name, String placeOfWork) {
        this.age = age;
        this.name = name;
        this.placeOfWork = placeOfWork;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }
    public void printName () {
        System.out.println(name);
    }
    public void printAge () {
        System.out.println(age);
    }
    public void printPlaceOfWork () {
        System.out.println(placeOfWork);
    }
}
