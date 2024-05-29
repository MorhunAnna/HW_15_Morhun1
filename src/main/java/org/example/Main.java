package org.example;
import java.lang.reflect.Field;

public class Main
{
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException
    {

        A a = new A();
        System.out.println("Initial data:" + a);

        Field id = A.class.getDeclaredField("id");
        Field name = A.class.getDeclaredField("name");

        id.setAccessible(true);
        name.setAccessible(true);

        id.set(a, "23");
        name.set(a, "T");

        System.out.println("New data:" + a);
    }
}

