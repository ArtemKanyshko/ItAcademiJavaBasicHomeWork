package HomeWork15;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class HomeWork15 {


    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        /* 1. Создать класс Man c произвольным набором полей и методов (не менее 3 полей не
         менее 3 методов). Создать метод, который распечатает информацию о классе
         (список методов и полей с их типами и доступностью) с помощью рефлексии.
         Вызвать метод с помощью рефлексии из основной программы.*/

        System.out.println("Задание 1");
        Class<Man> classMan = Man.class;
        printInfoClass(classMan);
        System.out.println();

        /* 2. Создайте класс с методом printHelloWorld(). Вызвать метод с помощью рефлексии
        из основной программы.*/

        System.out.println("Задание 2.");
        Class<HelloWorld> helloWorldClass1 = HelloWorld.class;
        Object helloWorld = helloWorldClass1.newInstance();
        Method methodHelloWorld = helloWorldClass1.getDeclaredMethod("printHelloWorld", null);
        methodHelloWorld.invoke(helloWorld);
        System.out.println();

        /* 3. Создать собственную аннотацию @AcademyInfo c полем year. Создать метод,
        помеченный этой аннотацией с заданным year, и метод без нее. С помощью
        рефлексии проверить наличие данной аннотации у этих методов из основной
        программы. */

        System.out.println("Задание 3.");

        Class<HomeWork15> homeWork15Class = HomeWork15.class;

        Method methodAnnotation = homeWork15Class.getMethod("methodAnnotation", null);
        System.out.println("Annotation AcademyInfo: " + methodAnnotation.isAnnotationPresent(AcademyInfo.class));
        Method methodAnnotationYear = homeWork15Class.getMethod("methodAnnotationYear", null);
        System.out.println("Annotation AcademyInfo: " + methodAnnotationYear.isAnnotationPresent(AcademyInfo.class));
        System.out.println(methodAnnotationYear.getAnnotation(AcademyInfo.class));
        /* вопрос по последнему заданию, с помощью гугла я разобрался как проверить наличие аннотации
        но не совсем понятна вся суть работы, а конкретно: у меня идея попросила поставить на мою созданную аннотацию
        аннотацию @Retention(RetentionPolicy.RUNTIME) (хотелось бы больше узнать что за она),
        и еще про invoke и getAnnotation*/



    }

    public static void printInfoClass (Class clazz) {
        Field[] fields = clazz.getDeclaredFields();
        Method[] methods = clazz.getMethods();
        System.out.println(Arrays.asList(fields));
        System.out.println(Arrays.asList(methods));
    }

    @AcademyInfo
    public static void methodAnnotation () {

    }
    @AcademyInfo(year = 2021)
    public static void methodAnnotationYear () {

    }

}
