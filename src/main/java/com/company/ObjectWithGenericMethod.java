package com.company;

public class ObjectWithGenericMethod {

    public static <T> boolean someMethod(T genericArgument) {
        if (genericArgument instanceof Number) {
            return true;
        }
        return false;
    }
}
